<template>
<div class="card">
  <header class="card-header">
    <p class="card-header-title">
      {{ post.title }}
    </p>
    <a href="#" class="card-header-icon" aria-label="more options">
      <span class="icon">
        <i class="fas fa-angle-down" aria-hidden="true"></i>
      </span>
    </a>
  </header>
  <div class="card-content">
    <div class="content">
      {{ post.content }}
    </div>
  </div>
  <footer class="card-footer">
    <a :href="post.link" class="card-footer-item">Read More</a>
  </footer>
</div>

</template>

<script>
export default {
    props : ['post']
}
</script>

<style scoped>
/* Card's with same height */
.card {
    padding-bottom: 40px;
    height: 100%;
}
footer{
    position: absolute;
    bottom: 0;
    width: 100%;
    left:0;
}
</style>
