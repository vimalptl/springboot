import Vue from "vue";
import VueRouter from "vue-router";
import Home from "./components/Home.vue";
import Login from "./components/Login.vue";
import FAQ from "./components/FAQ.vue";
import BUEFORM from "./components/bueforms.vue";
import NotFound from "./components/Notfound.vue";
//import Signup from "./components/profile/UserManager.vue";
import CustomerSearch from "./components/checkin/CustomerSearch.vue";
import CustomerInfo from "./components/checkin/CustomerInfo.vue";

Vue.use(VueRouter);

const router = new VueRouter({
  mode: "history",
  routes: [
    { path: "/home", name: "home", component: Home },
    { path: "/login", name: "login", component: Login },
    { path: "/faq", name: "faq", component: FAQ },
    { path: "/bue", name: "bue", component: BUEFORM },
//    { path: "/signup", name: "signup", component: Signup },
    {
      path: "/customer/search",
      name: "customersearch",
      component: CustomerSearch
    },
    { path: "/customer/info/:custid", name: "customerinfo", component: CustomerInfo  },
    { path: "/customer/info", name: "newcustomerinfo", component: CustomerInfo  },
    { path: "/", component: Home },
    { path: "*", name: "notfound", component: NotFound }
  ]
});

export default router;
