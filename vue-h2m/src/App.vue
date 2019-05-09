  <template>
  <div id="app">
    <component :is="layout">
      <router-view/>
    </component>
  </div>
</template>

<script>
const default_layout = "default";

export default {
  name: 'app',
  computed: {
    layout() {
      return (this.$route.meta.layout || default_layout) + "-layout";
    }
  },

  created() {
    // nothing defined here (when this.$route.path is other than "/")
    //console.log(this.$route, this.$route.meta.layout);
  },

  updated() {
    // something defined here whatever the this.$route.path
    //console.log(this.$route, this.$route.meta.layout);
  }
}
</script>

<style lang="scss">
/* App deployed on WebPortal center's the to menu, override style to add width 100% */
  .container-fluid {
    margin-right: auto;
    margin-left: auto;
    padding-left: 10px;
    padding-right: 10px;
    width: 100%;
  }
</style>
