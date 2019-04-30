import Vue from "vue";
import store from "./vuex/index.js";
import App from "./App.vue";
import router from "./router";
import Layout from "./layouts/Layout.vue";
import Buefy from "buefy";
import 'buefy/dist/buefy.css'

Vue.use(Buefy);
Vue.component("default-layout", Layout);

Vue.config.productionTip = false;

require("./assets/main.scss");

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount("#app");
