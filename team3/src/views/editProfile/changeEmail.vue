<template>
  <div class="masthead bg-primary text-white text-center">
    <div class="container d-flex align-items-center flex-column">
      <div class="row">
        <div class="col-12">
          <h1 class="text-center">Change Email</h1>
        </div>
      </div>

      <div class="row">
        <div class="col-12">
          <div class="form-group">
            <label for="newEmail">New Email</label>
            <input type="email" class="form-control" id="newEmail" placeholder="New Email">
          </div>

          <div class="form-group">
            <label for="confirmNewPassword">Confirm New Email</label>
            <input type="email" class="form-control" id="confirmNewPassword" placeholder="Confirm New Email">
          </div>

          <br>

          <button type="submit" class="btn btn-primary">Change email</button>

        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "changeEmail"
}
</script>

<style scoped>

</style>