<template>
  <div class="masthead bg-primary text-white text-center">
    <div class="container d-flex align-items-center flex-column">
      <div class="row">
        <div class="col-12">
          <h1 class="text-center">Change Password</h1>
        </div>
      </div>

      <div class="row">
        <div class="col-12">
          <div class="form-group">
            <label for="oldPassword">Old Password</label>
            <input type="password" class="form-control" id="oldPassword" placeholder="Old Password">
          </div>

          <div class="form-group">
            <label for="newPassword">New Password</label>
            <input type="password" class="form-control" id="newPassword" placeholder="New Password">
          </div>

          <div class="form-group">
            <label for="confirmNewPassword">Confirm New Password</label>
            <input type="password" class="form-control" id="confirmNewPassword" placeholder="Confirm New Password">
          </div>

          <br>

          <button type="submit" class="btn btn-primary">Change password</button>

        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "changePassword"
}
</script>

<style scoped>



</style>