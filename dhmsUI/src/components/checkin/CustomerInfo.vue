<template>
  <section>
    <form @submit.prevent="validateBeforeSubmit">
      <div class="columns is-mobile">
        <div class="column is-three-fifths is-offset-one-fifth">

          <b-field
            label="First name"
            :type="{'is-danger': errors.has('nameFirst')}"
            :message="errors.first('nameFirst')"
          >
            <b-input v-model="nameFirst" name="nameFirst" v-validate="'required|between:1,40'"/>
          </b-field>

          <b-field
            label="Last name"
            :type="{'is-danger': errors.has('nameLast')}"
            :message="errors.first('nameLast')"
          >
            <b-input v-model="nameLast" name="nameLast" v-validate="'required'"/>
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


          <b-field
            label="Address"
            :type="{'is-danger': errors.has('addr1')}"
            :message="errors.first('addr1')"
          >
            <b-input v-model="addr1" name="addr1" />
          </b-field>

          <b-field
            label="City"
          >
            <b-input v-model="city" name="city" />
          </b-field>

        <b-field label="Email">
            <b-input v-model="email" placeholder="Email"
                type="email"
                icon="email">
            </b-input>
        </b-field>




          <b-field
            label="ID Type"
            :type="{'is-danger': errors.has('idType')}"
            :message="errors.first('idType')"
          >
            <b-input v-model="idType" name="idType" v-validate="'required'"/>
          </b-field>

          <b-field
            label="ID Number"
            :type="{'is-danger': errors.has('idNumber')}"
            :message="errors.first('idNumber')"
          >
            <b-input v-model="idNumber" name="idNumber" v-validate="'required'"/>
          </b-field>


        <b-field label="Notes">
            <b-input maxlength="200"  v-model="notes"  type="textarea" ></b-input>
        </b-field>


          <!-- <b-field label="Rounded">
            <b-select placeholder="Select a character" rounded  v-for="(st,index) in statesList" v-bind:key="index">
              <option :value='st.value'>st.label</option>
            </b-select>
          </b-field> -->
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


company : '',
nameFirst : '',
nameLast: '',
gender: '',
addr1: '',
addr2: '',
city: '',
state: '',
zip: '',
country:'',
phone: '',
email: '',
fax: '',
userid: '',
idNumber: '',
idType: '',
imgfile: '',
dnr: false,
note: '',
      age: null,
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
    },
  }
};
</script>

<style>
.label {
  text-align: left;
}
</style>

