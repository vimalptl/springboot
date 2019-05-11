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
            <b-input v-model="firstName" name="firstName"/>
          </b-field>

          <b-field label="Last name">
            <b-input v-model="lastName" name="lastName"/>
          </b-field>
          <b-field label="ID Number">
            <b-input v-model="idNumber" name="idNumber"/>
          </b-field>
        </div>
      </div>
      <button type="button" @click="searchCustomers()" class="button is-primary">Submit</button>
    </section>
    <section class="container is-8">
             <b-table :data="customerlist" >
                <template slot-scope="props">
                <b-table-column field="nameFirst" label="First Name" sortable>
                    {{ props.row.nameFirst }}
                </b-table-column>

                <b-table-column field="nameLast" label="Last Name" sortable>
                    {{ props.row.nameLast }}
                </b-table-column>

                <b-table-column field="idNumber" label="ID Info" sortable>
                    {{ props.row.idNumber }}
                </b-table-column>

                <b-table-column field="custid" label="Customer ID" sortable>
                    {{ props.row.custId }}
                </b-table-column>


                <b-table-column label="Options">
                    <router-link :to="{ name: 'customerinfo', params: { custid: props.row.custId }}">Update</router-link>

                  <div class="buttons" centered>
                      <b-button type="button" class="button is-primary">Detail</b-button>
                      <b-button type="button" class="button is-danger" >Reserve</b-button>
                      <b-button type="button" class="button is-warning">Check-in</b-button>
                  </div>                  
                </b-table-column>
                          </template>
             </b-table>
</section>


  </div>
</template>

<script>
import cService from '../../services/customer.js'

export default {
  name: "customersearch",
  data() {
    return {
    firstName: "",
    lastName: "",
    idNumber: "",
    customerlist: [],
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
      }    ]
    }
    },
  methods: {
    searchCustomers() {
      if ((this.firstName != null && this.firstName.trim().length > 0) ||
      (this.lastName != null && this.lastName.trim().length > 0) ||
      (this.idNumber != null && this.idNumber.trim().length > 0)) {
        cService.searchCustomer(this.firstName, this.lastName, this.idNumber).then(data => {
            this.customerlist = data;
          }).catch(err => this.errors = err);
      }
    }
  },
};
</script>

<style>
</style>
