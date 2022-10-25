<template>
  <header class="masthead bg-primary text-white text-center">
  <div class="container d-flex align-items-center flex-column">
    <div class="row">
      <div class="col-12">
        <h1 class="text-center">Profile</h1>
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
                    <h2>John Doe</h2>
                  </div>
                </div>
                <div class="row">
                  <div class="col-12">
                    <p>
                      <i class="fas fa-map-marker-alt"></i>
                      Amsterdam, The Netherlands
                    </p>
                  </div>
                </div>
                <div class="row">
                  <div class="col-12">
                    <p>
                      <i class="fas fa-envelope"></i>
                      <a href="mailto:test@gmail.com">
                        fkajldsjfkl@gmail.com
                      </a>
                    </p>
                  </div>
                </div>
                <div class="row">
                  <div class="col-12">
                    <p>
                      <i class="fas fa-phone"></i>
                      <a href="tel:6234929">
                        6234892349
                      </a>
                    </p>
                  </div>
                </div>
                <!-- Change account details buttons -->
                <div class="row">
                  <div class="col-12">
                    <button class="btn btn-primary"> <router-link to="changePassword">Change Password</router-link></button>
                    <button class="btn btn-primary"> <router-link to="changeEmail">Change Email</router-link></button>
                    <button class="btn btn-primary"> <router-link to="changeBio">Change Bio</router-link></button>
                  </div>
                </div>
              </div>
              </div>
            </div>

          <div class="col-12">
            <h2>Bio</h2>
          </div>
          <!-- bio -->
          <div class="card">
            <div class="card-body">
              <div class="row">
                <div class="col-12">
                  <!-- bio -->
                  <div class="row">
                    <div class="col-12">
                      <p>Dit is een biografie van John Doe, ik vindt dit een geweldige website en ga hier
                        graag naartoe voor quizes en andere games</p>
                    </div>
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
        <h1>Level overview</h1>

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


</header>
</template>

<script>
export default {
  name: "profilePage"
}
</script>

<style scoped>
.avatar {
  width: 100%;
  border-radius: 50%;
}

.card {
  margin-bottom: 2em;
  border-radius: 0;
  background-color: transparent;
  display: inline-block;
  margin-left: 1em;
  margin-right: 1em;
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


</style>