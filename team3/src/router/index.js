import { createRouter, createWebHashHistory } from 'vue-router'


import Welcome from '@/components/Welcome.vue'
import profilePage from "@/views/profilePage.vue";
import levelOverview from "@/views/levelOverview";
import SignIn from "../components/SignIn.vue";
import RegisterPage from "../components/RegisterPage.vue";
import adminEditGame from "@/views/Admin/adminEditGame";
import gameOneSub from "@/views/Admin/subComponents/gameOneSub";
import gameTwoSub from "@/views/Admin/subComponents/gameTwoSub";
import gameThreeSub from "@/views/Admin/subComponents/gameThreeSub";
import gameFourSub from "@/views/Admin/subComponents/gameFourSub";
import gameFiveSub from "@/views/Admin/subComponents/gameFiveSub";
import gameSixSub from "@/views/Admin/subComponents/gameSixSub";
import gameTwoSubSub from "@/views/Admin/subComponents/gameTwoSubSub";
import adminUserList from "@/views/Admin/adminUserList";
import adminEditProfilePageWithId from "@/views/Admin/adminEditProfilePageWithId";
import adminEditProfilePage from "@/views/Admin/adminEditProfilePage";
import levelOne from "@/views/levelViews/levelOne";
import levelTwo from "@/views/levelViews/levelTwo";
import changeEmail from "@/views/editProfile/changeEmail";
import changePassword from "@/views/editProfile/changePassword";
import changeBio from "@/views/editProfile/changeBio";
import userNotes from "@/views/notes/userNotes";
import createNote from "@/views/notes/createNote";

const routes = [
    { path: "/home", component: Welcome },
    { path: "/", redirect: "/home"},
    { path: "/profilePage", component: profilePage},
    { path: "/signIn", component: SignIn},
    { path: "/registerPage", component: RegisterPage},
    { path: "/profilePage", component: profilePage},
    { path: "/level-overview", component: levelOverview},
    { path: "/levelOne", component: levelOne},
    { path: "/levelTwo", component: levelTwo},
    { path: "/admin-users", component: adminUserList},
    { path: "/admin-edit-user", component: adminEditProfilePage, children:[{
            path: ':id', component: adminEditProfilePageWithId,
        }]},
    { path: "/admin", component: adminEditGame,
    children: [
        { path: "game-1", component: gameOneSub, props:true},
        { path: "game-2", component: gameTwoSub,
            children: [{path: ':id', component: gameTwoSubSub}]},
        { path: "game-3", component: gameThreeSub},
        { path: "game-4", component: gameFourSub},
        { path: "game-5", component: gameFiveSub},
        { path: "game-6", component: gameSixSub},
    ]},
    { path: "/changeEmail", component: changeEmail},
    { path: "/changePassword", component: changePassword},
    { path: "/changeBio", component: changeBio},
    { path: "/userNotes", component: userNotes, children: [
            { path: ':id', component: userNotes},
        ]},
    { path: "/createNote/:id", component: createNote},

    { path: "/:pathMatch(.*)*", name: "not-found", component: Welcome },
    { path: "/", redirect: "/home"},
];

export const router = createRouter({
    history: createWebHashHistory(),
    routes
})