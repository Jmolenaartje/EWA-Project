<template>
  <div class="container d-flex align-items-center flex-column">
    <div class="row">
      <div class="col-12">
        <h1 class="text-center">Edit profile</h1>
      </div>
    </div>
    <div class="row">
      <div class="col-12">
        <div class="card">
          <div class="card-body">
            <div class="row">
              <div class="col-12 col-md-4">
                <img
                  src="https://www.w3schools.com/howto/img_avatar.png"
                  alt="Avatar"
                  class="avatar"
                />
              </div>
              <div class="col-12 col-md-8">
                <div class="row">
                  <div class="col-12">
                    <input v-model="selectedUser" />
                  </div>
                </div>
                <div class="row">
                  <div class="col-12">
                    <p>
                      <i class="fas fa-map-marker-alt"></i>
                      <input type="text" value="Amsterdam, The Netherlands" />
                    </p>
                  </div>
                </div>
                <div class="row">
                  <div class="col-12">
                    <p>
                      <i class="fas fa-envelope"></i>
                      <input type="text" value="email@gmail.com" />
                    </p>
                  </div>
                </div>
                <div class="row">
                  <div class="col-12">
                    <p>
                      <i class="fas fa-phone"></i>
                      <input type="text" value="0612345678" />
                    </p>
                  </div>
                </div>
                <div class="row">
                  <div class="col-12">
                    <button class="btn btn-primary">Change Password</button>
                  </div>
                </div>
              </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <!-- Level overview Header-->
    <div class="row">
      <div class="col-12">
        <div class="card">
          <div class="card-body">
            <h1>Level overview</h1>
          </div>
        </div>

        <!-- Table with level overview -->
        <table class="table">
          <thead>
            <tr>
              <th scope="col">Level ID</th>
              <th scope="col">Level Name</th>
              <th scope="col">Level Score</th>
              <th scope="col">Level Status</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <th scope="row">1</th>
              <td>Level 1</td>
              <td>100</td>
              <td>Completed</td>
            </tr>
            <tr>
              <th scope="row">2</th>
              <td>Level 2</td>
              <td>200</td>
              <td>Completed</td>
            </tr>
            <tr>
              <th scope="row">3</th>
              <td>Level 3</td>
              <td>300</td>
              <td>Completed</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>

</template>

<script>
export default {
  name: "profilePage",

  data(){
    return {
    selectedUser: this.$route.params.id
    }
  },

  mounted() {
  }
}
</script>

<style scoped>
.avatar {
  width: 100%;
  border-radius: 50%;
}

.card {
  margin-top: 2em;
  margin-bottom: 2em;
  border-radius: 0;
  background-color: transparent;
}

.card-body {
  padding: 2em;
}

h2 {
  margin-top: 0;
}

p {
  margin-bottom: 0;
}

a {
  color: #4b68b8;
}

a:hover {
  color: #4b68b8;
  text-decoration: none;
}
.card-body {
  padding: 2em;
}

.row {
  margin-bottom: 1em;
}

@media (min-width: 768px) {
  .card {
    border-radius: 0.25rem;
  }
}

@media (min-width: 992px) {
  .card {
    border-radius: 0.25rem;
  }
}

@media (min-width: 1200px) {
  .card {
    border-radius: 0.25rem;
  }
}

input {
  width: 15em;
  border: none;
  background: none;
  padding-left: 1em;
}


</style>