<template>
  <header class="masthead bg-primary text-white text-center">
    <div class="container d-flex align-items-center flex-column">
      <!-- Masthead Heading-->
      <h1 class="masthead-heading text-uppercase mb-0">Amsterdam Serious game</h1>
      <!-- Icon Divider-->
      <div class="divider-custom divider-light">
        <div class="divider-custom-line"></div>
        <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
        <div class="divider-custom-line"></div>
      </div>
      <!-- Masthead Subheading-->
      <p class="masthead-subheading font-weight-light mb-0">An EWA AMS team 3 project</p>
    </div>
  </header>
  <!-- Games Section-->
  <section class="page-section games d-flex justify-content-center" id="games">
    <div class="container justify-content-center">
      <!-- Game Section Heading-->
      <h2 class="page-section-heading text-center text-uppercase text-secondary mb-0">Games info</h2>
      <!-- Icon Divider-->
      <div class="divider-custom">
        <div class="divider-custom-line"></div>
        <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
        <div class="divider-custom-line"></div>
      </div>
      <!-- Game Grid Items-->
      <div style="padding-left: 100px" class="row justify-content-center">
        <!-- Game Item 1-->
        <div class="col-md-6 col-lg-4 mb-5">
          <div class="game-item mx-auto" data-bs-toggle="modal" data-bs-target="#gameModal1">
            <div class="game-item-caption d-flex align-items-center justify-content-center">
              <div class="game-item-caption-content text-center text-white"><i class="fas fa-plus fa-3x"></i></div>
            </div>
            <img class="img-fluid justify-content-center" id="photos" src="../assets/img/logoLevels/counterLevel.png" alt="..." />
            <p class="lead">Awareness Counting</p>
          </div>
        </div>
        <!-- Game Item 2-->
        <div class="col-md-6 col-lg-4 mb-5">
          <div class="game-item mx-auto" data-bs-toggle="modal" data-bs-target="#gameModal2">
            <div class="game-item-caption d-flex align-items-center justify-content-center h-100 w-100">
              <div class="game-item-caption-content text-center text-white"><i class="fas fa-plus fa-3x"></i></div>
            </div>
            <img class="img-fluid" id="photos" src="../assets/img/logoLevels/Q&a.png" alt="..." />
            <p class="lead">&emsp;&emsp;Quiz time!</p>
          </div>
        </div>
        <!-- Game Item 3-->
        <div class="col-md-6 col-lg-4 mb-5">
          <div class="game-item mx-auto" data-bs-toggle="modal" data-bs-target="#gameModal3">
            <div class="game-item-caption d-flex align-items-center justify-content-center">
              <div class="game-item-caption-content text-center text-white"><i class="fas fa-plus fa-3x"></i></div>
            </div>
            <img class="img-fluid" id="photos" src="../assets/img/logoLevels/safariLevel.png" alt="..." />
            <p class="lead">&emsp;&emsp;The Safari!</p>
          </div>
        </div>
        <!-- Game Item 4-->
        <div class="col-md-6 col-lg-4 mb-5 mb-lg-0">
          <div class="game-item mx-auto" data-bs-toggle="modal" data-bs-target="#gameModal4">
            <div class="game-item-caption d-flex align-items-center justify-content-center">
              <div class="game-item-caption-content text-center text-white"><i class="fas fa-plus fa-3x"></i></div>
            </div>
            <img class="img-fluid" id="photos" src="../assets/img/logoLevels/feedback.png" alt="..." />
            <p class="lead">Help on the go!</p>
          </div>
        </div>
        <!-- Game Item 5-->
        <div class="col-md-6 col-lg-4 mb-5 mb-md-0">
          <div class="game-item mx-auto" data-bs-toggle="modal" data-bs-target="#gameModal5">
            <div class="game-item-caption d-flex align-items-center justify-content-center">
              <div class="game-item-caption-content text-center text-white"><i class="fas fa-plus fa-3x"></i></div>
            </div>
            <img class="img-fluid" id="photos" src="../assets/img/logoLevels/meetingRound.png" alt="..." />
            <p class="lead">Feedback after Help</p>
          </div>
        </div>
        <!-- Game Item 6-->
        <div class="col-md-6 col-lg-4 mb-5 mb-md-0">
          <div class="game-item mx-auto" data-bs-toggle="modal" data-bs-target="#gameModal6">
            <div class="game-item-caption d-flex align-items-center justify-content-center">
              <div class="game-item-caption-content text-center text-white"><i class="fas fa-plus fa-3x"></i></div>
            </div>
            <img class="img-fluid" id="photos" src="../assets/img/logoLevels/bossMeeting.png" alt="..." />
            <p class="lead">&ensp;The final boss!</p>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- About Section-->
  <section class="page-section bg-primary text-white mb-0" id="about">
    <div class="container">
      <!-- About Section Heading-->
      <h2 class="page-section-heading text-center text-uppercase text-white">About</h2>
      <!-- Icon Divider-->
      <div class="divider-custom divider-light">
        <div class="divider-custom-line"></div>
        <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
        <div class="divider-custom-line"></div>
      </div>
      <!-- About Section Content-->
      <div class="row">
        <div class="col-lg-4 ms-auto"><p class="lead">Hey, we are Team 3 for the Amsterdamn project called serious game,
          but what is this serious game ? And what is it for ?</p></div>
        <div class="col-lg-4 me-auto"><p class="lead">Well it is a website too spread awareness about the many forms of
          disabilities and handicaps. We spread this awareness through multiple games and activities.</p></div>
      </div>
    </div>
  </section>
  <!-- Game Modals-->
  <!-- Game Modal 1 Counting-->
  <div class="game-modal modal fade" id="gameModal1" tabindex="-1" aria-labelledby="gameModal1" aria-hidden="true">
    <div class="modal-dialog modal-xl">
      <div class="modal-content">
        <div class="modal-header border-0"><button class="btn-close" type="button" data-bs-dismiss="modal" aria-label="Close"></button></div>
        <div class="modal-body text-center pb-5">
          <div class="container">
            <div class="row justify-content-center">
              <div class="col-lg-8">
                <!-- Game Modal - Title-->
                <h2 class="Game-modal-title text-secondary text-uppercase mb-0">Awareness Counting!</h2>
                <!-- Icon Divider-->
                <div class="divider-custom">
                  <div class="divider-custom-line"></div>
                  <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
                  <div class="divider-custom-line"></div>
                </div>
                <!-- Game Modal - Image-->
                <img class="img-fluid rounded mb-5" id="photos2" src="../assets/img/logoLevels/counterLevel.png" alt="..." />
                <!-- Game Modal - Text-->
                <p class="mb-4">Awareness counting. In this level you must count all the form of disabilities and
                  handicaps on your walk to for example School or work, you will get about ... minutes to count as
                  many as possible. With this we hope to give you insight in the differences and amount of it all.<br>
                  <br>For example, The share of people with a physical disability in the netherlands is about 12% to 13%</p>
                <button class="btn btn-primary" data-bs-dismiss="modal">
                  <i class="fas fa-xmark fa-fw"></i>
                  Close
                </button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- Game Modal 2 Quiz-->
  <div class="game-modal modal fade" id="gameModal2" tabindex="-1" aria-labelledby="gameModal2" aria-hidden="true">
    <div class="modal-dialog modal-xl">
      <div class="modal-content">
        <div class="modal-header border-0"><button class="btn-close" type="button" data-bs-dismiss="modal" aria-label="Close"></button></div>
        <div class="modal-body text-center pb-5">
          <div class="container">
            <div class="row justify-content-center">
              <div class="col-lg-8">
                <!-- Game Modal - Title-->
                <h2 class="game-modal-title text-secondary text-uppercase mb-0">Quiz time!</h2>
                <!-- Icon Divider-->
                <div class="divider-custom">
                  <div class="divider-custom-line"></div>
                  <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
                  <div class="divider-custom-line"></div>
                </div>
                <!-- Game Modal - Image-->
                <img class="img-fluid rounded mb-5" id="photos2" src="../assets/img/logoLevels/Q&a.png" alt="..." />
                <!-- Game Modal - Text-->
                <p class="mb-4">A Quiz to test your knowledge and awareness <br><br>
                this is an event that you plan in and do at a location. Hopefully you come out of it with even more knowledge</p>
                <button class="btn btn-primary" data-bs-dismiss="modal">
                  <i class="fas fa-xmark fa-fw"></i>
                  Close
                </button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- Game Modal 3 Safari-->
  <div class="game-modal modal fade" id="gameModal3" tabindex="-1" aria-labelledby="gameModal3" aria-hidden="true">
    <div class="modal-dialog modal-xl">
      <div class="modal-content">
        <div class="modal-header border-0"><button class="btn-close" type="button" data-bs-dismiss="modal" aria-label="Close"></button></div>
        <div class="modal-body text-center pb-5">
          <div class="container">
            <div class="row justify-content-center">
              <div class="col-lg-8">
                <!-- Game Modal - Title-->
                <h2 class="game-modal-title text-secondary text-uppercase mb-0">Safari</h2>
                <!-- Icon Divider-->
                <div class="divider-custom">
                  <div class="divider-custom-line"></div>
                  <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
                  <div class="divider-custom-line"></div>
                </div>
                <!-- Game Modal - Image-->
                <img class="img-fluid rounded mb-5" id="photos2" src="../assets/img/logoLevels/safariLevel.png" alt="..." />
                <!-- Game Modal - Text-->
                <p class="mb-4">This is an event you must plan in and do with a group of fellow participants <br><br>
                here we will have you experience a specific disability like blindness or being stuck in a wheelchair</p>
                <button class="btn btn-primary" data-bs-dismiss="modal">
                  <i class="fas fa-xmark fa-fw"></i>
                  Close
                </button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- Game Modal 4 (Digital platform) Help on the go!-->
  <div class="game-modal modal fade" id="gameModal4" tabindex="-1" aria-labelledby="gameModal4" aria-hidden="true">
    <div class="modal-dialog modal-xl">
      <div class="modal-content">
        <div class="modal-header border-0"><button class="btn-close" type="button" data-bs-dismiss="modal" aria-label="Close"></button></div>
        <div class="modal-body text-center pb-5">
          <div class="container">
            <div class="row justify-content-center">
              <div class="col-lg-8">
                <!-- Game Modal - Title-->
                <h2 class="game-modal-title text-secondary text-uppercase mb-0">Help on the go!</h2>
                <!-- Icon Divider-->
                <div class="divider-custom">
                  <div class="divider-custom-line"></div>
                  <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
                  <div class="divider-custom-line"></div>
                </div>
                <!-- Game Modal - Image-->
                <img class="img-fluid rounded mb-5" id="photos2" src="../assets/img/logoLevels/feedback.png" alt="..." />
                <!-- Game Modal - Text-->
                <p class="mb-4">A page or application designed for feedback and help on specific issues or ideas</p>
                <button class="btn btn-primary" data-bs-dismiss="modal">
                  <i class="fas fa-xmark fa-fw"></i>
                  Close
                </button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- Game Modal 5 Feedback after help-->
  <div class="game-modal modal fade" id="gameModal5" tabindex="-1" aria-labelledby="gameModal5" aria-hidden="true">
    <div class="modal-dialog modal-xl">
      <div class="modal-content">
        <div class="modal-header border-0"><button class="btn-close" type="button" data-bs-dismiss="modal" aria-label="Close"></button></div>
        <div class="modal-body text-center pb-5">
          <div class="container">
            <div class="row justify-content-center">
              <div class="col-lg-8">
                <!-- Game Modal - Title-->
                <h2 class="game-modal-title text-secondary text-uppercase mb-0">Feedback after help</h2>
                <!-- Icon Divider-->
                <div class="divider-custom">
                  <div class="divider-custom-line"></div>
                  <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
                  <div class="divider-custom-line"></div>
                </div>
                <!-- Game Modal - Image-->
                <img class="img-fluid rounded mb-5" id="photos2" src="../assets/img/logoLevels/meetingRound.png" alt="..." />
                <!-- Game Modal - Text-->
                <p class="mb-4">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec bibendum neque eu turpis
                  commodo convallis. Aenean egestas leo quis tristique auctor. Pellentesque sapien urna, mollis vel
                  massa non, luctus mattis ante. Nam ut lobortis ligula. Vivamus lorem orci, facilisis vitae dictum in,
                  tempor quis lorem. Maecenas ac elit porta, lobortis nulla at, efficitur est. Ut vitae dignissim neque.</p>
                <button class="btn btn-primary" data-bs-dismiss="modal">
                  <i class="fas fa-xmark fa-fw"></i>
                  Close
                </button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- Game Modal 6 Final boss-->
  <div class="game-modal modal fade" id="gameModal6" tabindex="-1" aria-labelledby="gameModal6" aria-hidden="true">
    <div class="modal-dialog modal-xl">
      <div class="modal-content">
        <div class="modal-header border-0"><button class="btn-close" type="button" data-bs-dismiss="modal" aria-label="Close"></button></div>
        <div class="modal-body text-center pb-5">
          <div class="container">
            <div class="row justify-content-center">
              <div class="col-lg-8">
                <!-- Game Modal - Title-->
                <h2 class="game-modal-title text-secondary text-uppercase mb-0">The final boss</h2>
                <!-- Icon Divider-->
                <div class="divider-custom">
                  <div class="divider-custom-line"></div>
                  <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
                  <div class="divider-custom-line"></div>
                </div>
                <!-- Game Modal - Image-->
                <img class="img-fluid rounded mb-5" id="photos2" src="../assets/img/logoLevels/bossMeeting.png" alt="..." />
                <!-- Game Modal - Text-->
                <p class="mb-4">The final boss! Meet the ... and talk to him about your solution for the city <br><br>
                However this only counts for the top 3 players on the scoreboard</p>
                <button class="btn btn-primary" data-bs-dismiss="modal">
                  <i class="fas fa-xmark fa-fw"></i>
                  Close
                </button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
   name: "WelcomeTemplate",
  
  
}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
#photos {
  padding-left: 20px;
  height: 100px;
}

#photos2 {
  height: 150px;
}
</style>
