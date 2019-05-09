<template>
  <div class="home">
    <section class="hero is-primary">
      <div class="hero-body">
        <!-- <h1 class="title">Primary title</h1> -->
        <h2 class="subtitle">Today is {{now}}.</h2>
      </div>
    </section>
    <br>
    <section class="container is-8">
      <b-tabs type="is-boxed">
        <b-tab-item label="Status" icon="google-photos"></b-tab-item>
        <b-tab-item label="Check-In" icon="library-music"></b-tab-item>
        <b-tab-item label="Reservation" icon="video"></b-tab-item>
      </b-tabs>
    </section>
  </div>
</template>

<script>
import lhService from "../services/loginhistory.js";

export default {
  name: "home",
  data: () => ({
    userid: "",
    loginhists: [],
    errors: [],
    now: new Date().toString(),
    columns: [
      {
        field: "id",
        label: "ID",
        width: "40",
        numeric: true
      },
      {
        field: "userId",
        label: "UserId"
      },
      {
        field: "userName",
        label: "UserName"
      },
      {
        field: "userGroup",
        label: "Group"
      },
      {
        field: "logonTime",
        label: "Login"
      },
      {
        field: "logoutTime",
        label: "LogOut"
      },
      {
        field: "updateTime",
        label: "Last Updated"
      }
    ]
  }),
  methods: {
    loadPosts() {
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
};
</script>

<style>
</style>
