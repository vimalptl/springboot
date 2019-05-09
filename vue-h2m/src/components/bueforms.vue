<template>
  <section>
    <form @submit.prevent="validateBeforeSubmit">
      <div class="columns is-mobile">
        <div class="column is-three-fifths is-offset-one-fifth">
          <b-field label="Select a date">
            <b-datepicker placeholder="Type or select a date..." icon="calendar-today" editable></b-datepicker>
          </b-field>
          <b-field
            label="First name"
            :type="{'is-danger': errors.has('firstname')}"
            :message="errors.first('firstname')"
          >
            <b-input v-model="firstname" name="firstname" v-validate="'required'"/>
          </b-field>
          <b-field
            label="Last name"
            :type="{'is-danger': errors.has('lastname')}"
            :message="errors.first('lastname')"
          >
            <b-input v-model="lastname" name="lastname" v-validate="'required'"/>
          </b-field>

          <b-field
            label="Age"
            :type="{'is-danger': errors.has('age')}"
            :message="errors.first('age')"
          >
            <b-input
              type="number"
              v-model="age"
              name="age"
              v-validate="'required|integer|between:18,65'"
            />
          </b-field>
          <b-field
            label="Gender"
            :addons="false"
            :type="{'is-danger': errors.has('gender')}"
            :message="errors.first('gender')"
          >
            <b-radio v-model="gender" name="gender" native-value="M">Male</b-radio>
            <b-radio v-model="gender" name="gender" native-value="F">Female</b-radio>
          </b-field>

          <b-switch
            v-model="isSwitchedCustom"
            true-value="Yes"
            false-value="No"
          >{{ isSwitchedCustom }}</b-switch>

          <b-field
            label="Username"
            :type="{'is-danger': errors.has('username')}"
            :message="errors.first('username')"
          >
            <b-input type="text" v-model="username" name="username" v-validate="'required|alpha'"/>
          </b-field>

          <b-field
            label="Password"
            :type="{'is-danger': errors.has('password')}"
            :message="errors.first('password')"
          >
            <b-input
              type="password"
              v-model="password"
              name="password"
              v-validate="'required|min:8'"
            />
          </b-field>
          <b-field label="Rounded">
            <b-select placeholder="Select a character" rounded>
              <option value="flint">Flint</option>
              <option value="silver">Silver</option>
            </b-select>
          </b-field>
          <section>
            <b-field>
              <b-switch v-model="isAmPm">AM/PM</b-switch>
            </b-field>
            <b-field label="Select time">
              <b-timepicker
                rounded
                placeholder="Click to select..."
                icon="clock"
                :hour-format="format"
              ></b-timepicker>
            </b-field>
          </section>
          <section>
            <div class="block">
              <b-checkbox v-model="checkboxGroup" native-value="Silver">Silver</b-checkbox>
              <b-checkbox v-model="checkboxGroup" native-value="Flint">Flint</b-checkbox>
              <b-checkbox v-model="checkboxGroup" native-value="Vane">Vane</b-checkbox>
              <b-checkbox v-model="checkboxGroup" native-value="Billy" disabled>Billy</b-checkbox>
            </div>
            <p class="content">
              <b>Selection:</b>
              {{ checkboxGroup }}
            </p>
          </section>

          <button type="submit" class="button is-primary">Submit</button>
        </div>
      </div>
    </form>

    <!-- <form @submit.prevent="validateBeforeSubmit">


      <b-field
        label="Gender"
        :addons="false"
        :type="{'is-danger': errors.has('gender')}"
        :message="errors.first('gender')"
      >
        <b-radio v-model="gender" name="gender" native-value="M" v-validate="'required'">Male</b-radio>
        <b-radio v-model="gender" name="gender" native-value="F" v-validate="'required'">Female</b-radio>
      </b-field>

      <b-field
        label="Username"
        :type="{'is-danger': errors.has('username')}"
        :message="errors.first('username')"
      >
        <b-input type="text" v-model="username" name="username" v-validate="'required|alpha'"/>
      </b-field>

      <b-field
        label="Password"
        :type="{'is-danger': errors.has('password')}"
        :message="errors.first('password')"
      >
        <b-input type="password" v-model="password" name="password" v-validate="'required|min:8'"/>
      </b-field>

      <b-field
        label="Confirm password"
        :type="{'is-danger': errors.has('confirm-password')}"
        :message="[{
                    'The confirm password field is required' : errors.firstByRule('confirm-password', 'required'),
                    'The confirm password is not valid' : errors.firstByRule('confirm-password', 'is')
                }]"
      >
        <b-input
          type="password"
          v-model="confirmPassword"
          name="confirm-password"
          v-validate="{ required: true, is: password }"
        />
      </b-field>

      <b-field
        label="Where did you find us ?"
        :type="{'is-danger': errors.has('question')}"
        :message="errors.first('question')"
      >
        <b-select
          v-model="question"
          name="question"
          placeholder="Select an option"
          v-validate="'required'"
        >
          <option value="google">Google</option>
          <option value="github">Github</option>
          <option value="other">Other</option>
        </b-select>
      </b-field>

      <b-field
        label
        :type="{'is-danger': errors.has('flag-terms')}"
        :message="{'Please check this box to proceed' : errors.firstByRule('flag-terms', 'required')}"
      >
        <b-checkbox
          v-model="flagTerms"
          name="flag-terms"
          v-validate="'required:false'"
        >I agree to the terms and conditions</b-checkbox>
      </b-field>

      <button type="submit" class="button is-primary">Submit</button>
    </form>-->
  </section>
</template>

<script>
import Vue from "vue";
// // You have to install VeeValidate to use it:
// // 'npm install vee-validate'
import VeeValidate from "vee-validate";
import Buefy from "buefy";
import "buefy/dist/buefy.css";

Vue.use(Buefy);
const config = {
  aria: true,
  classNames: {},
  classes: false,
  delay: 0,
  dictionary: null,
  errorBagName: "errors", // change if property conflicts
  events: "input|blur",
  fieldsBagName: "fields",
  i18n: null, // the vue-i18n plugin instance
  i18nRootKey: "validations", // the nested key under which the validation messages will be located
  inject: true,
  locale: "en",
  validity: false,
  useConstraintAttrs: true
};

Vue.use(VeeValidate, config);

export default {
  name: "bueforms",
  data() {
    return {
      firstname: null,
      lastname: null,
      age: null,
      username: null,
      password: null,
      confirmPassword: null,
      gender: false,
      question: null,
      flagTerms: false,
      isSwitchedCustom: false,
      checkboxGroup: [],
      isAmPm: false
    };
  },
  computed: {
    format() {
      return this.isAmPm ? "12" : "24";
    }
  },
  methods: {
    validateBeforeSubmit() {
      this.$validator.validateAll().then(result => {
        if (result) {
          this.$toast.open({
            message: "Form is valid!",
            type: "is-success",
            position: "is-bottom"
          });
          return;
        }
        this.$toast.open({
          message: "Form is not valid! Please check the fields.",
          type: "is-danger",
          position: "is-bottom"
        });
      });
    }
  }
};
</script>

<style>
.label {
  text-align: left;
}
</style>

