<template>

<nav class="navbar" role="navigation" aria-label="main navigation">
  <div class="navbar-brand">
    <a class="navbar-item" href="https://bulma.io">
      <img src="https://bulma.io/images/bulma-logo.png" width="112" height="28">
    </a>

    <a role="button" class="navbar-burger burger" aria-label="menu" aria-expanded="false" data-target="navbarBasicExample">
      <span aria-hidden="true"></span>
      <span aria-hidden="true"></span>
      <span aria-hidden="true"></span>
    </a>
  </div>

  <div id="navbarBasicExample" class="navbar-menu">
    <div class="navbar-start">
      <router-link to="/home" class="navbar-item">Home</router-link>

      <div class="navbar-item has-dropdown is-hoverable">
        <a class="navbar-link">
          Checkin
        </a>

        <div class="navbar-dropdown">
          <router-link to="/customer/info" class="navbar-item">New Customer</router-link>
          <router-link to="/customer/search" class="navbar-item">Existing Customer</router-link>

        </div>

      </div>


      <div class="navbar-item has-dropdown is-hoverable">
        <a class="navbar-link">
          Reservation
        </a>

        <div class="navbar-dropdown">
          <a class="navbar-item">
            Add
          </a>
          <router-link to="/FAQ" class="navbar-item">FAQ - Axios</router-link>
          <a class="navbar-item">
            Find / Modify
          </a>
          <hr class="navbar-divider">
          <a class="navbar-item">
            Block
          </a>
        </div>
      </div>

      <div class="navbar-item has-dropdown is-hoverable">
        <a class="navbar-link">
          Report
        </a>

        <div class="navbar-dropdown">
          <a class="navbar-item">
            Daily
          </a>
          <a class="navbar-item">
            Monthly
          </a>
          <a class="navbar-item">
            Yearly
          </a>
          <a class="navbar-item">
            Shift
          </a>
        </div>
      </div>


    </div>




    <div class="navbar-end">
      <div class="navbar-item">
        <div class="buttons">
      <router-link to="/signup" class="button is-primary">
        Sign-Up
      </router-link>          
      <router-link to="/login" class="button is-light">
        <span v-if="isAuthenticated">Logout</span><span v-else>Login</span>
      </router-link>          
        </div>
      </div>
    </div>
  </div>
</nav>


</template>
<script>

import { mapGetters } from 'vuex';
export default {
  computed: {
    ...mapGetters(['isAuthenticated'])
  }
}
</script>