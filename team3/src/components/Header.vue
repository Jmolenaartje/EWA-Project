<template>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"
        integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A=="
        crossorigin="anonymous" referrerpolicy="no-referrer"/>
  <nav class="navbar navbar-expand-lg bg-secondary text-uppercase fixed-top" id="mainNav">
    <div class="container">
      <a class="navbar-brand" ref="#page-top">
        <router-link to="/home">
          <img id="logo" src="../assets/img/Gemeente-Amsterdam-logo-groot-1.png"></router-link>
      </a>

      <button class="navbar-toggler text-uppercase font-weight-bold bg-primary text-white rounded" type="button"
              data-bs-toggle="collapse" data-bs-target="#navbarResponsive" aria-controls="navbarResponsive"
              aria-expanded="false" aria-label="Toggle navigation">
        Menu
        <i class="fas fa-bars"></i>
      </button>

      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ms-auto">
          <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded">
            <router-link to="/admin">Admin</router-link>
          </a></li>
          <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded">
            <router-link to="/admin-users">Users</router-link>
          </a></li>
          <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded">
            <router-link to="/level-overview">Level overview</router-link>
          </a></li>
          <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded">
            <router-link to="/profilePage">My Profile</router-link>
          </a></li>
        </ul>
      </div>
    </div>
  </nav>
</template>

<script>
export default {
  name: "HeaderTemplate",
}
</script>

<style>
#mainNav {
  background-color: white !important;

  text-decoration-color: red;
}



#logo:hover, #logo {
  height: 100px;
}

a {
  text-decoration: none;
  color: red;

}



</style>