<template>
  <div class="customersearch">
    <section class="hero is-primary">
      <div class="hero-body">
        <h1 class="title">Customer Search</h1>
        <h2 class="subtitle">Search for customers, will provide options to see details etc.</h2>
      </div>
    </section>
    <br>
    <section class="container is-8">
      <div class="columns is-desktop">
        <div class="column">
          <b-field label="First name">
            <b-input v-model="firstName" name="nameFirst"/>
          </b-field>

          <b-field label="Last name">
            <b-input v-model="lastName" name="nameLast"/>
          </b-field>
          <b-field label="ID Number">
            <b-input v-model="idNumber" name="idNumber"/>
          </b-field>
          <button v-on:click="loadPosts()" class="button is-primary">Submit</button>
          <b-table :data="customerlist" :columns="columns" paginated="true" per-page="1"></b-table>
        </div>
      </div>
    </section>
  </div>
</template>

<script>
//import cService from '../../services/customer.js'

export default {
  name: "customersearch",
  data: () => ({
    firstName: "",
    lastName: "",
    idNbr: "",
    customerlist: [],
    errors: [],
    columns: [
      {
        field: "custId",
        label: "Customer ID"
      },
      {
        field: "nameFirst",
        label: "First Name"
      },
      {
        field: "nameLast",
        label: "Last Name"
      },
      {
        field: "idNumber",
        label: "Id Info"
      },
      {
        label: "Options"
      }
    ]
  }),
  methods: {
    loadPosts() {
      // if (this.firstName != null && this.firstName.length > 0) {
      //   cService.searchCustomer(this.firstName, this.lastName, this.idNbr).then(data => {
      //       this.customerlist = data;
      //     }).catch(err => this.errors = err);
      // }
    }
  },
  created() {
    this.loadPosts();
  }
};
</script>

<style>
</style>
