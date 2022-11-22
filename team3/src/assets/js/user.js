export class User {
    rankt;
    userName;
    password;
    email;
    phoneNumber;
    city;
    country;
    score;


    constructor(rank, userName, password, email, phoneNumber, city, country, score) {
        this.rank = rank;
        this.userName = userName;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.country = country;
        this.score = score;
    }

      static createUser() {
        let randomNumber = Math.floor(Math.random() * 5);

         let user = new User(fakeRank[0], fakeUserName[randomNumber], fakePassword[randomNumber], fakeEmail[randomNumber],
            fakePhoneNumber[randomNumber], fakeCity[randomNumber],fakecountry, fakeScore[0])

        fakeRank.shift();
        fakeScore.shift();
        return user;
    }


}
const fakeRank = [1,2,3,4,5,6,7,8,9,10];
const fakeUserName = ["issy", "jan", "pieter", "erik", "tom"]
const fakePassword = ["sdsfdgdfg", "gfdfgfdgf", "dfdsfd", "dfdsfd", "fuiyiu"]
const fakeEmail = ["issy@gmail.com", "jan", "pieter@gmail.com", "erik@gmail.com", "tom@gmail.com"]
const fakePhoneNumber = ["067842741", "063623641", "0674242561", "064347811", "0667882312"]
const fakeCity = ["Hoorn", "Haarlem", "Amsterdam", "Heiloo", "Purmerend"]
const fakecountry = "nederland"
const fakeScore = [1000, 900, 800, 700, 600, 500, 400, 300, 200, 100];

// for (const rank of fakeRank) {
//     console.log(rank);
// }
//
// for (const score of fakeScore) {
//     console.log(score);
// }
//
// fakeRank.filter(rank => rank.condition <= 10).forEach(rank => console.log(rank))
// fakeScore.filter(score => score.condition >= 100).forEach(score => console.log(score))
