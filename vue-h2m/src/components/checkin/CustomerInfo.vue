<template>
  <div class="customerinfo">
    <section class="hero is-primary">
      <div class="hero-body">
        <h1 class="title" v-if="isUpdate">Update Customer: {{$route.params.custid}} </h1>
        <h1 class="title" v-else>Add Customer</h1>
        <h2 class="subtitle" v-if="isUpdate">Update customer information.</h2>
        <h2 class="subtitle" v-else>New customer added during check-in process.</h2>
      </div>
    </section>
    <br>
    <section class="container is-8">
      <form @submit.prevent="validateBeforeSubmit">
        <div class="columns is-desktop">
          <div class="column">
            <b-field
              label="First name"
              :type="{'is-danger': errors.has('nameFirst')}"
              :message="errors.first('nameFirst')"
            >
              <b-input v-model="customer.nameFirst" name="nameFirst" v-validate="'required|between:1,40'"/>
            </b-field>

            <b-field
              label="Last name"
              :type="{'is-danger': errors.has('nameLast')}"
              :message="errors.first('nameLast')"
            >
              <b-input v-model="customer.nameLast" name="nameLast" v-validate="'required'"/>
            </b-field>

            <!-- <b-field
            label="Gender"
            :addons="false"
            :type="{'is-danger': errors.has('gender')}"
            :message="errors.first('gender')"
          >
            <b-radio v-model="gender" name="gender" native-value="M">Male</b-radio>
            <b-radio v-model="gender" name="gender" native-value="F">Female</b-radio>
            </b-field>-->

            <b-field
              label="Address"
              :type="{'is-danger': errors.has('addr1')}"
              :message="errors.first('addr1')"
            >
              <b-input v-model="customer.addr1" name="addr1"/>
            </b-field>

            <b-field label="City">
              <b-input v-model="customer.city" name="city"/>
            </b-field>

            <b-field label="State">
              <b-select v-model="customer.state" placeholder="Select a State">
                <option
                  v-for="option in statesList"
                  :value="option.abbreviation"
                  :key="option.abbreviation"
                >{{ option.name }}</option>
              </b-select>
            </b-field>

            <b-field label="Country">
              <b-select v-model="customer.country" placeholder="Country">
                <option
                  v-for="option in countryList"
                  :value="option.name"
                  :key="option.name"
                >{{ option.name }}</option>
              </b-select>
            </b-field>

            <b-field label="Email">
              <b-input v-model="customer.email" placeholder="Email" type="email" icon="email"></b-input>
            </b-field>
          </div>

          <div class="column">
            <b-switch v-model="customer.dnr" v-if="isUpdate">
                DNR ?
            </b-switch>

            <b-field
              label="ID Type"
              :type="{'is-danger': errors.has('idType')}"
              :message="errors.first('idType')"
            >
              <b-input v-model="customer.idType" name="idType" v-validate="'required'"/>
            </b-field>

            <b-field
              label="ID Number"
              :type="{'is-danger': errors.has('idNumber')}"
              :message="errors.first('idNumber')"
            >
              <b-input v-model="customer.idNumber" name="idNumber" v-validate="'required'"/>
            </b-field>

            <b-field label="Notes">
              <b-input maxlength="200" v-model="customer.notes" type="textarea"></b-input>
            </b-field>
          </div>
        </div>
        <button type="submit" class="button is-primary">Submit</button>
      </form>
    </section>
  </div>
</template>

<script>
import Vue from "vue";
// // You have to install VeeValidate to use it:
// // 'npm install vee-validate'
import VeeValidate from "vee-validate";
import Buefy from "buefy";
import "buefy/dist/buefy.css";
import TypeLists from "../../data/typelists";
import cService from "../../services/customer"

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
  name: "customerinfo",
  data() {
    return {
      customer: {
      id: "",
      company: "",
      nameFirst: "",
      nameLast: "",
      gender: "",
      addr1: "",
      addr2: "",
      city: "",
      state: "",
      zip: "",
      country: "",
      phone: "",
      email: "",
      fax: "",
      userid: "",
      idNumber: "",
      idType: "",
      imgfile: "",
      dnr: true,
      notes: ""
      },
      statesList: TypeLists.States,
      countryList: TypeLists.Countries,
      isUpdate : false
    };
  },
  created() {
    if (this.$route.params.custid != null) {      
      this.isUpdate = true;
      /* Retrieve customer Info with provided id*/   
      this.getCustomer(this.$route.params.custid);
      this.customer.id = this.$route.params.custid;
    }
  },
  computed: {
  },
  methods: {
    getCustomer(custid) {
      if ((custid != null)) {
        cService.getCustomer(custid).then(response => {
            this.customer = response.data
          }).catch(err => this.errors = err);
      }
    },
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

