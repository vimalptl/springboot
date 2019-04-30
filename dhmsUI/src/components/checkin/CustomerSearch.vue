<template>
<div class="customersearch">
    <div class="container">
      <section class="section">
        <h1 class="title">Customer Search</h1>
        <div class="field">
          <label class="label">Enter First Name</label>
          <div class="control">
            <input class="inputFirst" v-model="firstName" type="text">
          </div>
        </div>


        <div class="field is-horizonal">
          <div class="field-label is-normal">
          </div>
        <div class="field-body">
          <div class="field">
            <div class="control"> 
              <button v-on:click="loadPosts()" class="button is-primary">Submit</button>
            </div>
          </div>
        </div>
        </div>
        <b-table :data="customerlist" :columns="columns"  paginated="true"
            per-page="1"></b-table>
      </section>
    </div>

</div>
</template>

<script>
import cService from '../../services/customer.js'



export default {
  name: 'customersearch',
  data: () => ({
    firstName : '',
    lastName  : '',
    idNbr : '',
    customerlist: [],
    errors: [],
    columns: [
                    {
                        field: 'custId',
                        label: 'Customer ID',
                    },
                    {
                        field: 'nameFirst',
                        label: 'First Name'
                    },
                    {
                        field: 'nameLast',
                        label: 'Last Name'
                    },
                    {
                        field: 'idNumber',
                        label: 'Id Info'
                    },
                    {
                        label: 'Options'
                    },
]
 }),
  methods: {
    loadPosts () {
      if (this.firstName != null && this.firstName.length > 0) {
        cService.searchCustomer(this.firstName, this.lastName, this.idNbr).then(data => {
            this.customerlist = data;
          }).catch(err => this.errors = err);
      }
    }
  },
  created() {
    this.loadPosts();
  }
}

</script>

<style>

</style>
