<template>
  <header class="masthead bg-primary text-white text-center">
  <div class="container d-flex align-items-center flex-column">
    <div class="row">

      <!-- Header-->
      <div class="col-12">
        <h1 class="text-center">Coming soon!</h1><br><br>
      </div>
      <div>
        <h3>The game you are looking for is still being worked on</h3>
      </div>
      <div class="d-flex flex-column">
        <router-link to="/level-overview">
          <div class="btn btn-primary">
            <span class="fas fa-chevron-left ms-1"></span>
            Return
            <span class="fas fa-chevron-right ms-1 "></span>
          </div>
        </router-link>
        </div>
    </div>
  </div>
  </header>
</template>

<script>
export default {
  name: "ComingSoon"
}
</script>

<style scoped>

</style>