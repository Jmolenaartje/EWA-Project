export class User {
    userName;
    password;
    email;
    phoneNumber;
    city;
    country;


    constructor(userName, password, email, phoneNumber, city, country) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.country = country;
    }

    static createUser() {
        let randomNumber = Math.floor(Math.random() * 5);

        return new User(fakeUserName[randomNumber], fakePassword[randomNumber], fakeEmail[randomNumber],
            fakePhoneNumber[randomNumber], fakeCity[randomNumber],fakecountry);
    }


}

const fakeUserName = ["issy", "jan", "pieter", "erik", "tom"]
const fakePassword = ["sdsfdgdfg", "gfdfgfdgf", "dfdsfd", "dfdsfd", "fuiyiu"]
const fakeEmail = ["issy@gmail.com", "jan", "pieter@gmail.com", "erik@gmail.com", "tom@gmail.com"]
const fakePhoneNumber = ["067842741", "063623641", "0674242561", "064347811", "0667882312"]
const fakeCity = ["Hoorn", "Haarlem", "Amsterdam", "Heiloo", "Purmerend"]
const fakecountry = "nederland"