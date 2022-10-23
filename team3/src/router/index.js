import { createRouter, createWebHashHistory } from 'vue-router'

import Welcome from '@/components/Welcome.vue'
import profilePage from "@/views/profilePage.vue";
import levelOverview from "@/views/levelOverview";
import changeEmail from "@/views/editProfile/changeEmail";
import changePassword from "@/views/editProfile/changePassword";
import changeBio from "@/views/editProfile/changeBio";

const routes = [
    { path: "/home", component: Welcome },
    { path: "/profilePage", component: profilePage},
    { path: "/level-overview", component: levelOverview},
    { path: "/changeEmail", component: changeEmail},
    { path: "/changePassword", component: changePassword},
    { path: "/changeBio", component: changeBio},
    { path: "/", redirect: "/home"},
];

export const router = createRouter({
    history: createWebHashHistory(),
    routes
})