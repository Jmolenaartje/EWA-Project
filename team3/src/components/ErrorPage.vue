<template>
  <header class="masthead bg-primary text-white text-center">
    <div class="container d-flex align-items-center flex-column">
      <div class="row">

        <!-- Header-->
        <div class="col-12">
          <h1 class="text-center">404 Error!</h1><br><br>
        </div>
        <div>
          <h3>You arrived on an invalid link, so kindly return to home</h3>
        </div>
        <div class="d-flex flex-column">
          <router-link to="/home">
            <div class="btn btn-primary">
              <span class="fas fa-chevron-left ms-1"></span>
              Return home
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
  name: "ErrorPage"
}
</script>

<style scoped>

</style>