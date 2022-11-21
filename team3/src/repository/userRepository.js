export default class UserRepository {
    async getUserAll() {
        const response = await fetch('http://localhost:8089/users/all');
        return await response.json();
    }

    async getUserById(userId) {
        const response = await fetch('http://localhost:8089/users/' + userId);
        return await response.json();
    }

    async createUser(userName,name,email,password) {
        const response = await fetch('http://localhost:8089/users/add/', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({
              userName,name,email,password
            }),
        });
        return await response.json();
    }

    async deleteUserById(userId) {
        const response = await fetch('http://localhost:8089/users/' + userId, {
            method: 'DELETE',
        });
        return await response.json();
    }

    async updateUserById( userId, user) {
        const response = await fetch('http://localhost:8089/users/' + userId, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({userId, user}),
        });
        return await response.json();
    }
}