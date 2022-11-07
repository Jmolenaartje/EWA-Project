
export default class UserRepository {
    async getAllUsers() {
        // GET request using fetch with async/await
        const response = await fetch("http://localhost:8081/user/all");
        const data = await response.json();
        return data;
    }


 
}



