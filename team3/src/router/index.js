import { createRouter, createWebHashHistory } from 'vue-router'
import Welcome from '@/components/Welcome.vue'
import profilePage from "@/views/profilePage.vue";
import levelOverview from "@/views/levelOverview";
import levelOne from "@/views/levelViews/levelOne";




const routes = [
    { path: "/home", component: Welcome },
    { path: "/profilePage", component: profilePage},
    { path: "/level-overview", component: levelOverview},
    { path: "/levelOne", component: levelOne},
    { path: "/", redirect: "/home"},
];

export const router = createRouter({
    history: createWebHashHistory(),
    routes
})