import { createRouter, createWebHashHistory } from 'vue-router'


import Welcome from '@/components/Welcome.vue'
import profilePage from "@/views/profilePage.vue";
import levelOverview from "@/views/levelOverview";
import SignIn from "../components/SignIn.vue";
import RegisterPage from "../components/RegisterPage.vue";

const routes = [
    { path: "/home", component: Welcome },
    { path: "/", redirect: "/home"},
    { path: "/profilePage", component: profilePage},
    { path: "/signIn", component: SignIn},
    { path: "/registerPage", component: RegisterPage},
    { path: "/profilePage", component: profilePage},
    { path: "/level-overview", component: levelOverview},
   ];

export const router = createRouter({
    history: createWebHashHistory(),
    routes
})