<template>
  <div class="content">
    <div class="header border-0"></div>
    <div class="body text-center pb-5">
      <div class="container">
        <div class="row justify-content-center">
          <div class="col-lg-8 shadow-lg p-3 m-5 bg-white rounded">
            <!-- title -->
            <p class="mb-1 h-1">Create account</p>
            <!-- Icon Divider-->
            <div class="divider-custom">
              <div class="divider-custom-line"></div>
              <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
              <div class="divider-custom-line"></div>
            </div>
            <!-- divider -->
            <div class="d-flex flex-column align-items-center">
              <div class="d-flex align-items-center">
                <div class="form-group mb-3">
                  <label for="exampleInputEmail1">User Name</label>
                  <input
                    type="email"
                    class="form-control"
                    id="emailInput"
                    aria-describedby="emailHelp"
                    placeholder="Enter email"
                  />
                  <label for="exampleInputEmail1">phone number</label>
                  <input
                    type="tel"
                    class="form-control"
                    id="telInput"
                    placeholder="phonenumber"
                  />
                  <label for="exampleInputEmail1">Password</label>
                  <input
                    type="password"
                    class="form-control"
                    id="passwordInput"
                    placeholder="password"
                  />
                  <label for="exampleInputEmail1">Password</label>
                  <input
                    type="password"
                    class="form-control"
                    id="password-check"
                    placeholder="password"
                  />
                </div>
              </div>

              <router-link to="/">
                <div class="btn btn-primary">
                  Create Account<span class="fas fa-chevron-right ms-1"></span>
                </div>
              </router-link>

              <router-link to="/">
                <div class="btn btn-secondary mt-1">
                  Sign in<span class="fas fa-chevron-right ms-1"></span>
                </div>
              </router-link>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
// export default {
//   data: {}
// };
</script>

<style></style>
