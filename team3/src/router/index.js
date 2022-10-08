import { createRouter, createWebHashHistory } from 'vue-router'

import Welcome from '@/components/Welcome.vue'
import profilePage from "@/views/profilePage.vue";
import levelOverview from "@/views/levelOverview";

const routes = [
    { path: "/home", component: Welcome },
    { path: "/profilePage", component: profilePage},
    { path: "/level-overview", component: levelOverview},
    { path: "/", redirect: "/home"},
];

export const router = createRouter({
    history: createWebHashHistory(),
    routes
})