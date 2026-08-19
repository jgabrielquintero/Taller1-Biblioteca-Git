package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Client> clients = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Loan> loans = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Client Management");
            System.out.println("2. Book Management");
            System.out.println("3. Loan Management");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    clientMenu();
                    break;
                case 2:
                    bookMenu();
                    break;
                case 3:
                    loanMenu();
                    break;
                case 0:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (option != 0);
    }

    public static void clientMenu() {
        int option;
        do {
            System.out.println("\n--- CLIENT MANAGEMENT ---");
            System.out.println("1. Create client");
            System.out.println("2. List clients");
            System.out.println("3. Search client");
            System.out.println("4. Update client");
            System.out.println("5. Delete client");
            System.out.println("0. Back to main menu");
            System.out.print("Choose an option: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    createClient();
                    break;
                case 2:
                    listClients();
                    break;
                case 3:
                    searchClient();
                    break;
                case 4:
                    updateClient();
                    break;
                case 5:
                    deleteClient();
                    break;
                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (option != 0);
    }

    public static void bookMenu() {
        int option;
        do {
            System.out.println("\n--- BOOK MANAGEMENT ---");
            System.out.println("1. Create book");
            System.out.println("2. List books");
            System.out.println("3. Search book");
            System.out.println("4. Update book");
            System.out.println("5. Delete book");
            System.out.println("0. Back to main menu");
            System.out.print("Choose an option: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    createBook();
                    break;
                case 2:
                    listBooks();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    updateBook();
                    break;
                case 5:
                    deleteBook();
                    break;
                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (option != 0);
    }

    public static void loanMenu() {
        int option;
        do {
            System.out.println("\n--- LOAN MANAGEMENT ---");
            System.out.println("1. Register loan");
            System.out.println("2. Register return");
            System.out.println("3. List loans");
            System.out.println("0. Back to main menu");
            System.out.print("Choose an option: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    createLoan();
                    break;
                case 2:
                    returnLoan();
                    break;
                case 3:
                    listLoans();
                    break;
                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (option != 0);
    }

    public static void createClient() {
        System.out.print("Enter the id: ");
        String id = sc.nextLine();

        System.out.print("Enter the name: ");
        String name = sc.nextLine();

        System.out.print("Enter the phone: ");
        String phone = sc.nextLine();

        System.out.print("Enter the email: ");
        String email = sc.nextLine();

        Client c = new Client(id, name, phone, email);
        clients.add(c);

        System.out.println("Client registered successfully");
    }

    public static void listClients() {
        for (Client c : clients) {
            System.out.println("ID: " + c.getId() + ", Name: " + c.getName()
                    + ", Phone: " + c.getPhone() + ", Email: " + c.getEmail());
        }
    }

    public static void searchClient() {
        System.out.print("Enter the id to search: ");
        String searchedId = sc.nextLine();

        boolean found = false;

        for (Client c : clients) {
            if (c.getId().equals(searchedId)) {
                System.out.println("ID: " + c.getId() + ", Name: " + c.getName()
                        + ", Phone: " + c.getPhone() + ", Email: " + c.getEmail());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Client not found");
        }
    }

    public static void updateClient() {
        System.out.print("Enter the id of the client to update: ");
        String searchedId = sc.nextLine();

        boolean found = false;

        for (Client c : clients) {
            if (c.getId().equals(searchedId)) {
                System.out.print("Enter the name: ");
                String name = sc.nextLine();

                System.out.print("Enter the phone: ");
                String phone = sc.nextLine();

                System.out.print("Enter the email: ");
                String email = sc.nextLine();

                c.setName(name);
                c.setPhone(phone);
                c.setEmail(email);

                found = true;
            }
        }
        if (!found) {
            System.out.println("Client not found");
        }
    }

    public static void deleteClient() {
        System.out.print("Enter the id of the client to delete: ");
        String searchedId = sc.nextLine();

        clients.removeIf(c -> c.getId().equals(searchedId));
        System.out.println("Client deleted");
    }

    public static void createBook() {
        System.out.print("Enter the code: ");
        String code = sc.nextLine();

        System.out.print("Enter the title: ");
        String title = sc.nextLine();

        System.out.print("Enter the publication year: ");
        String publicationYear = sc.nextLine();

        System.out.print("Enter the author: ");
        String author = sc.nextLine();

        Book b = new Book(code, title, publicationYear, author);
        books.add(b);

        System.out.println("Book registered successfully");
    }

    public static void listBooks() {
        for (Book b : books) {
            System.out.println("Code: " + b.getCode() + ", Title: " + b.getTitle()
                    + ", Publication year: " + b.getPublicationYear() + ", Author: " + b.getAuthor()
                    + ", Available: " + b.getAvailable());
        }
    }

    public static void searchBook() {
        System.out.print("Enter the code to search: ");
        String searchedCode = sc.nextLine();

        boolean found = false;

        for (Book b : books) {
            if (b.getCode().equals(searchedCode)) {
                System.out.println("Code: " + b.getCode() + ", Title: " + b.getTitle()
                        + ", Publication year: " + b.getPublicationYear() + ", Author: " + b.getAuthor()
                        + ", Available: " + b.getAvailable());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book not found");
        }
    }

    public static void updateBook() {
        System.out.print("Enter the code of the book to update: ");
        String searchedCode = sc.nextLine();

        boolean found = false;

        for (Book b : books) {
            if (b.getCode().equals(searchedCode)) {
                System.out.print("Enter the title: ");
                String title = sc.nextLine();

                System.out.print("Enter the publication year: ");
                String publicationYear = sc.nextLine();

                System.out.print("Enter the author: ");
                String author = sc.nextLine();

                System.out.print("Still available? (true/false): ");
                String availableText = sc.nextLine();
                boolean available = Boolean.parseBoolean(availableText);

                b.setTitle(title);
                b.setPublicationYear(publicationYear);
                b.setAuthor(author);
                b.setAvailable(available);

                found = true;
            }
        }
        if (!found) {
            System.out.println("Book not found");
        }
    }

    public static void deleteBook() {
        System.out.print("Enter the code of the book to delete: ");
        String searchedCode = sc.nextLine();

        books.removeIf(b -> b.getCode().equals(searchedCode));
        System.out.println("Book deleted");
    }

    public static Client findClientById(String id) {
        for (Client c : clients) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public static Book findBookByCode(String code) {
        for (Book b : books) {
            if (b.getCode().equals(code)) {
                return b;
            }
        }
        return null;
    }

    public static void createLoan() {
        System.out.print("Enter the client id: ");
        String clientId = sc.nextLine();
        Client client = findClientById(clientId);

        if (client == null) {
            System.out.println("Client not found");
            return;
        }

        System.out.print("Enter the book code: ");
        String bookCode = sc.nextLine();
        Book book = findBookByCode(bookCode);

        if (book == null) {
            System.out.println("Book not found");
            return;
        }

        if (!book.getAvailable()) {
            System.out.println("The book is not available");
            return;
        }

        System.out.print("Enter the loan id: ");
        String loanId = sc.nextLine();

        Loan loan = new Loan(loanId, client, book, "active");
        loans.add(loan);
        book.setAvailable(false);

        System.out.println("Loan registered successfully");
    }

    public static void returnLoan() {
        System.out.print("Enter the id of the loan to return: ");
        String searchedId = sc.nextLine();

        boolean found = false;

        for (Loan loan : loans) {
            if (loan.getLoanId().equals(searchedId)) {
                loan.setStatus("returned");
                loan.getBook().setAvailable(true);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Loan not found");
        } else {
            System.out.println("Return registered successfully");
        }
    }

    public static void listLoans() {
        if (loans.isEmpty()) {
            System.out.println("No loans registered");
            return;
        }

        for (Loan loan : loans) {
            System.out.println("Loan id: " + loan.getLoanId() + ", Client: "
                    + loan.getClient().getName() + ", Book: " + loan.getBook().getTitle()
                    + ", Date: " + loan.getDate() + ", Status: " + loan.getStatus());
        }
    }
}