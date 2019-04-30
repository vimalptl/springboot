<template>
<div class="usermanager">

  <ul v-if="errors && errors.length">
    <li v-for="error of errors" v-bind:key='error.message'>
      {{error.message}}
    </li>
  </ul>
<section>
        <b-message type="is-danger" v-if="notification.error.length > 0">
            Sorry! Something went wrong. Please try again!
        </b-message>
        <b-message type="is-success" v-if="notification.success.length > 0">
            Thank you! You're successfully registered. Please Login to continue!
        </b-message>
</section>
<div class="field">
  <label class="label">{{name.label}}</label>
  <div class="control">
    <input v-model="name.value"  class="input" :type="name.type" placeholder="Text input" :value="name.value">
  </div>
</div>

<div class="field">
  <label class="label">{{username.label}}</label>
  <div class="control has-icons-left has-icons-right">
    <input v-model="username.value"
          class="input is-success" 
          :type="username.type" 
          placeholder="Text input" 
          :value="username.value">
    <span class="icon is-small is-left">
      <i class="fas fa-user"></i>
    </span>
    <span class="icon is-small is-right">
      <i class="fas fa-check"></i>
    </span>
  </div>
  <p class="help is-danger" v-if="hasUsername">This username is unavailable</p>
</div>

<div class="field">
  <label class="label">{{email.label}}</label>
  <div class="control has-icons-left has-icons-right">
    <input v-model="email.value"  class="input is-danger" :type="email.type" placeholder="Email input" :value="email.value">
    <span class="icon is-small is-left">
      <i class="fas fa-envelope"></i>
    </span>
    <span class="icon is-small is-right">
      <i class="fas fa-exclamation-triangle"></i>
    </span>
  </div>
  <p class="help is-danger" v-if="hasEmail">This email alreay exist or is invalid</p>
</div>

<div class="field">
  <label class="label">{{password.label}}</label>
  <p class="control has-icons-left">
    <input v-model="password.value"  class="input" :type="password.type" placeholder="Password" :value="password.value">
    <span class="icon is-small is-left">
      <i class="fas fa-lock"></i>
    </span>
  </p>
</div>


<div class="field">
  <div class="control">
    <label class="checkbox">
      <input v-model="agreement" type="checkbox">
      I agree to the <a href="#">terms and conditions</a>
    </label>
  </div>
</div>

<div class="field is-grouped">
  <div class="control">
    <button class="button is-primary" v-on:click="submitPost()" >Submit</button>
  </div>
</div>
</div>
</template>

<script>
  import uService from '../../services/user.js'
  import { signup, checkUsernameAvailability, checkEmailAvailability } from '../../utils/APIUtils';

export default {
  name: 'usermanager',
  data() {
    return {
      name: {
        name: "name",
        label: "Name :",
        value: "",
        type: "text",
        validate: {
          required: true,
          min: 8
        },
        error: ''
      },
      username: {
        name: "username",
        label: "Username :",
        value: "",
        type: "text",
        validate: {
          required: true,
        },
        error: ''
      },
      email: {
        name: "email",
        label: "Email :",
        value: "",
        type: "email",
        validate: {
          required: true,
        },
        error: ''
      },
      password: {
        name: "password",
        label: "Password :",
        value: "",
        type: "password",
        validate: {
          required: true,
          min: 8
        },
        error: ''
      },
      agreement: false,
      notification: {
        success: {},
        error: {}
      }
    } 
  },
  methods: {
    submitPost () {
      this.notification.error = {};
      this.notification.success = {};
      let signupRequest = {
        name : this.name.value,
        username  : this.username.value,
        email : this.email.vauel,
        password : this.password.value,
        agreement: this.agreement,
      }
      signup(signupRequest)
        .then(response => {
            notification.success({
                message: 'success',
                description: "Thank you! You're successfully registered. Please Login to continue!",
            });          
        }).catch(error => {
            notification.error({
                message: 'error',
                description: error.message || 'Sorry! Something went wrong. Please try again!'
            });
        });      
      // uService.signup(signupRequest).then(response => {
      //       alert(response.status);
      //   }).catch(e => {
      //       this.errors.push(e);
      //       });
      // }
    },
    hasEmail () {
      this.errors = [];
      this.success = [];
      uService.checkEmailAvailability(this.email.value).then(response => {
            this.hasEmail = false;
        }).catch(e => {
            this.hasEmail = true;
        });
      },
    hasUsername () {
      this.errors = [];
      this.success = [];
      uService.checkUsernameAvailability(this.username.value).then(response => {
            this.hasUserName = false;
        }).catch(e => {
            this.hasUserName = false;
        });
      }
    }
}
</script>

<style>

</style>