<#macro contact_card databasecontato>
    <div id="contact-card">
        <i id="contact-img-i-i" class="bx bx-user"></i>
        <h2 id="contact-name">${databasecontato.name}</h2>
        <p id="contact-phone">${databasecontato.phone}</p>
        <p id="contact-email">${databasecontato.email}</p>
        <i id="contact-favorite-i" class="bx bx-heart"></i>
        <i id="contact-edit-i" class="bx bx-edit"></i>
        <i id="contact-delete-i" class="bx bx-trash"></i>
    </div>
</#macro>