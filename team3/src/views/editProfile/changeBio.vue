<template>
  <div class="masthead bg-primary text-white text-center">
    <div class="container d-flex align-items-center flex-column">
      <div class="row">
        <div class="col-12">
          <h1 class="text-center">Change Bio</h1>
        </div>
      </div>

      <div class="row">
        <div class="col-12">
          <div class="form-group">
            <label for="newBio">New Bio</label>
            <input type="text" class="form-control" id="newBio" placeholder="New Bio">
          </div>

          <br>

          <button type="submit" class="btn btn-primary">Change bio</button>

        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "changeBio"
}
</script>

<style scoped>

#newBio {
  width: 50em;
}

</style>