package com.projeto.controllers;

import com.projeto.repository.MovieRepository;
import com.projeto.service.*;

import java.util.Scanner;

public class Controller {
    private ActorService actorService;
    private DirectorService directorService;
    private ProducerService producerService;
    private ScreewriterService screenwriterService;
    private MovieService movieService;
    private Scanner sc;

    public Controller() {
        this.actorService = new ActorService();
        this.directorService = new DirectorService();
        this.producerService = new ProducerService();
        this.screenwriterService = new ScreewriterService();
        this.movieService = new MovieService(new MovieRepository());
        this.sc = new Scanner(System.in);
    }

    private void createActor() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    private void createDirector() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    private void createProducer() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    private void createScreenwriter() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    private void createMovie() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    private void associateMovieActor() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    private void associateMovieDirector() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    private void associateMovieProducer() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    private void associateMovieScreenwriter() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    private void findMovie() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    private void listAllMovies() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }

    private void printRegisterSubMenu() {
        System.out.println("---------------------------------");
        System.out.println("Escolha uma das opções a seguir:");
        System.out.println("1. Cadastrar um ator");
        System.out.println("2. Cadastrar um diretor");
        System.out.println("3. Cadastrar um produtor");
        System.out.println("4. Cadastrar um roteirista");
        System.out.println("5. Cadastrar um filme");
        System.out.println("---------------------------------");
    }

    private void executeRegisterSubMenu() {
        int op = this.sc.nextInt();
        this.sc.nextLine();

        switch (op) {
            case 1:
                createActor();
                break;
            case 2:
                createDirector();
                break;
            case 3:
                createProducer();
                break;
            case 4:
                createScreenwriter();
                break;
            case 5:
                createMovie();
                break;
            default:
                System.out.println(String.format("Opção %d inválida!", op));
        }
    }

    private void printAssociateSubMenu() {
        System.out.println("---------------------------------");
        System.out.println("Escolha uma das opções a seguir:");
        System.out.println("1. Associar um ator a um filme");
        System.out.println("2. Associar um diretor a um filme");
        System.out.println("3. Associar um produtor a um filme");
        System.out.println("4. Associar um roteirista a um filme");
        System.out.println("---------------------------------");
    }

    private void executeAssociateSubMenu() {
        int op = this.sc.nextInt();
        this.sc.nextLine();

        switch (op) {
            case 1:
                associateMovieActor();
                break;
            case 2:
                associateMovieDirector();
                break;
            case 3:
                associateMovieProducer();
                break;
            case 4:
                associateMovieScreenwriter();
                break;
            default:
                System.out.println(String.format("Opção %d inválida!", op));
        }
    }

    private void printMainMenu() {
        System.out.println("---------------------------------");
        System.out.println("Escolha uma das opções a seguir:");
        System.out.println("1. Cadastrar");
        System.out.println("2. Associar");
        System.out.println("3. Buscar um filme por nome");
        System.out.println("4. Listar todos filmes");
        System.out.println("0. Sair");
        System.out.println("---------------------------------");
    }

    private void executeMainMenu(int op) {
        switch (op) {
            case 0:
                System.out.println("Até a próxima!");
                break;
            case 1:
                printRegisterSubMenu();
                executeRegisterSubMenu();
                break;
            case 2:
                printAssociateSubMenu();
                executeAssociateSubMenu();
                break;
            case 3:
                findMovie();
                break;
            case 4:
                listAllMovies();
                break;
            default:
                System.out.println(String.format("Opção %d inválida!", op));
        }
    }

    public void mainMenu() {
        int op = -1;

        while(op != 0) {
            printMainMenu();
            op = this.sc.nextInt();
            this.sc.nextLine();
            executeMainMenu(op);
        }

        this.sc.close();
    }
}