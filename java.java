document.getElementById('codeForm').addEventListener('submit', function (e) {
    e.preventDefault();

    // Obfuscated code using Base64 encoding
    const encodedCode = "MTEyOTgy";  // Base64 encoding of the code '112982'
    const encodedMessage = "aGFja293ZWVue3sgOCAxIDE2IDE2IDI1XzggMSAzIDExIDE1IDIzIDUgNSAxNCA4IDEgMyAxMSA1IDE4IDE5fQ=="; // Encoded message 'hackoween{8 1 16 16 25_8 1 3 11 15 23 5 5 14_8 1 3 11 5 18 19}'

    const enteredCode = document.getElementById('codeInput').value;
    const message = document.getElementById('message');
    const secret = document.getElementById('secret');

    // Decode Base64-encoded secret code
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
