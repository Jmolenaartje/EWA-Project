export class User {
    userName;
    password;
    email;
    name;


    constructor(userName,name, password, email, ) {
        this.userName = userName;
        this.name = name;
        this.password = password;
        this.email = email;
    
    }

    static createUser() {
        let randomNumber = Math.floor(Math.random() * 5);

        return new User(fakeUserName[randomNumber], fakePassword[randomNumber], fakeEmail[randomNumber],
            fakeName[randomNumber]);
    }


}

const fakeUserName = ["issy", "jan", "pieter", "erik", "tom"]
const fakePassword = ["sdsfdgdfg", "gfdfgfdgf", "dfdsfd", "dfdsfd", "fuiyiu"]
const fakeEmail = ["issy@gmail.com", "jan", "pieter@gmail.com", "erik@gmail.com", "tom@gmail.com"]
const fakeName  = ["issy", "jan", "pieter", "erik", "tom"]
