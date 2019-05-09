import Vue from 'vue'
import VueRouter from 'vue-router'
import Category from './components/Category.vue'
import Home from './components/Home.vue'
import Login from './components/Login.vue'
import Signup from './components/profile/UserManager.vue'
import FAQ from './components/FAQ.vue'
import CustomerSearch from './components/checkin/CustomerSearch.vue'
import CustomerInfo from './components/checkin/CustomerInfo.vue'
//import UserManager from './components/profile/UserManager.vue'
import NotFound from './components/Notfound.vue'

// Load on fly example 
//const NotFound = () => System.import('./components/Notfound.vue')

Vue.use(VueRouter)

const router = new VueRouter({
    mode : 'history',
    routes: [
        { path: '/home', name: "home",  component: Home},
        { path: '/login', name: "login",  component: Login},
        { path: '/signup', name: "signup",  component: Signup},
        { path: '/faq', name: "faq",  component: FAQ},        
        { path: '/customer/search', name: "CustomerSearch",  component: CustomerSearch},        
        { path: '/customer/info', name: "CustomerInfo",  component: CustomerInfo},        
        { path: '/', component: Category},
        { path: '*', name: "notfound", component: NotFound}
    ]
})

export default router