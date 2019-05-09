<template>
  <div class="layout">
    <section class="header-section">
      <app-header></app-header>
    </section>
    <section class="container-section">
      <slot/>
    </section>
    <section class="footer-section">
      <app-footer></app-footer>
    </section>
  </div>
</template>

<script>
import AppHeader from "@/components/AppHeader.vue";
import AppFooter from "@/components/AppFooter.vue";

export default {
  name: "Layout",
  props: {
    msg: String
  },
  components: {
    "app-header": AppHeader,
    "app-footer": AppFooter
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
</style>
