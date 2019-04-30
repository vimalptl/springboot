<template>
<div class="home">
    <div class="container">
      <section class="section">
        <h1 class="title">Login History</h1>
        <div class="field">
          <label class="label">Enter UserId</label>
          <div class="control">
            <input class="input" v-model="userid" type="text" placeholder="e.g vimalp">
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
        <b-table :data="loginhists" :columns="columns"  paginated="true"
            per-page="7"></b-table>
      </section>
    </div>

</div>
</template>

<script>
import lhService from '../services/loginhistory.js'

export default {
  name: 'home',
  data: () => ({
    userid : '',
    loginhists: [],
    errors: [],
    columns: [
                    {
                        field: 'id',
                        label: 'ID',
                        width: '40',
                        numeric: true
                    },
                    {
                        field: 'userId',
                        label: 'UserId'
                    },
                    {
                        field: 'userName',
                        label: 'UserName'
                    },
                    {
                        field: 'userGroup',
                        label: 'Group'
                    },
                    {
                        field: 'logonTime',
                        label: 'Login'
                    },
                    {
                        field: 'logoutTime',
                        label: 'LogOut'
                    },
                    {
                        field: 'updateTime',
                        label: 'Last Updated'
                    }
]
 }),
  methods: {
    loadPosts () {
      if (this.userid != null && this.userid.length > 0) {
      let user = this.userid;
      lhService.getPosts(user).then(data => {
          this.loginhists = data;
        });
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
