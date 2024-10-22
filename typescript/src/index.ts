class App {
    private readonly message: string

    constructor(message: string) {
        this.message = message
    }

    public show(elementId: string) {
        const element = document.getElementById(elementId);
        if (element) {
            element.innerHTML = this.message;
        }
    }
}

const app = new App('Hello, Typescript!');
app.show('message');