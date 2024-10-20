document.getElementById('codeForm').addEventListener('submit', function (e) {
    e.preventDefault();


    const encodedCode = "MTEzMDgy";  
    const encodedMessage = "OCAxIDE2IDE2IDI1IDggMSAzIDExIDE1IDIzIDUgNSAxNCA4IDEgMyAxMSA1IDE4IDE5";

    const enteredCode = document.getElementById('codeInput').value;
    const message = document.getElementById('message');
    const secret = document.getElementById('secret');

    // Decode Base64 encoded secret code
    const decodedCode = atob(encodedCode);

    if (enteredCode === decodedCode) {
        message.textContent = "";

        // Decode the secret message from Base64
        const decodedMessage = atob(encodedMessage);
        
        secret.classList.remove('hidden');
        document.getElementById('password').textContent = decodedMessage;
    } else {
        message.textContent = "Incorrect code. Try again.";
        secret.classList.add('hidden');
    }
});
