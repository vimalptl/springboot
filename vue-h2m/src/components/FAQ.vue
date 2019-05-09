<template>
<div class="faq">

    <div class="container">
      <section class="section">
        <h1 class="title">FAQ</h1>
        <h2 class="subtitle is-4">Lorum ipsum and all of that jazz.</h2>

        <div class="columns  is-multiline" v-if="faqs && faqs.length">
          <div class="column is-one-third" v-for="faq of faqs" v-bind:key="faq.id">
            <div class="card">
              <div class="card-content">
                <p class="title">{{ faq.title }}</p>
                <p class="answer">{{ faq.body }}</p>
              </div>
            </div>
          </div>
        </div>
      </section>
    </div>

  </div>

</template>

<script>
// import axios from 'axios';
import faqService from '@/services/faq.js'

export default {
  name: 'faq',
  data: () => ({
    faqs: [],
    errors: []
  }),
  methods: {
    loadPosts () {
      faqService.getPosts().then(data => {
        this.faqs = data
      });
    }
  },
  created() {
    this.loadPosts();
  },
  watch() {
    this.loadPosts();
  }

  // created() {
  //   axios.get('http://jsonplaceholder.typicode.com/posts')
  //     .then(response => {
  //       this.faqs = response.data.slice(0,10);
  //     })
  //     .catch(e => {
  //       this.errors.push(e)
  //     })
  // }
}

</script>

<style>

</style>
