package com.projeto.controllers;

import com.projeto.domain.Director;
import com.projeto.domain.Movie;
import com.projeto.repository.MovieRepository;
import com.projeto.repository.DirectorRepository;
import com.projeto.service.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.List;
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
        this.directorService = new DirectorService(new DirectorRepository());
        this.producerService = new ProducerService();
        this.screenwriterService = new ScreewriterService();
        this.movieService = new MovieService(new MovieRepository());
        this.sc = new Scanner(System.in);
    }

    private void createActor() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    private int createDirector(String name, int age, String gender) {
        //System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

        return this.directorService.createDirector(name,age,gender);
    }

    private void createProducer() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());

    }

    private void createScreenwriter() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    private int createMovie(String name, LocalDate releaseDate, double budget, String description) {
        return this.movieService.create(name, releaseDate, budget, description);
    }

    private void associateMovieActor() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    private void associateMovieDirector() {
        //System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        System.out.println("---------------------------------");
        System.out.println("Associar um Diretor ao filme");
        System.out.println("---------------------------------");
        Movie objmovie;
        while (true) {
            System.out.println("Qual filme deseja associar um diretor? ");

            String movie = sc.nextLine();
             objmovie = movieService.find(movie);
            if (objmovie == null) {
                System.out.println(String.format("Filme com nome %s não foi encontrado.", movie));
            } else {
                System.out.println(objmovie);
                break;
            }
        }
        Director objdirector;
        while(true) {
            System.out.println("Qual diretor deseja associar ao filme? ");


            String director = sc.nextLine();
             objdirector = directorService.findDirector(director);
             if(objdirector==null){
                 System.out.printf("Diretor %s não encontrado. \n",director);
             }else{
                 System.out.println(objdirector.toString());
                 break;
             }

        }
        movieService.associateDirector(objmovie,objdirector,directorService);
        System.out.println("Diretor associado com sucesso!");

    }

    private void associateMovieProducer() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    private void associateMovieScreenwriter() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    private Movie findMovie(String name) {
        return this.movieService.find(name);
    }

    private List<Movie> listAllMovies() {
        return this.movieService.listAll();
    }

    private void printExecuteMenuCreateActor() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        createActor();
    }

    private void printExecuteMenuCreateDirector() {
        //System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        System.out.println("---------------------------------");
        System.out.println("Cadastrar um Diretor");
        System.out.println("---------------------------------");

        System.out.print("Digite o nome do diretor: ");
        String name=this.sc.nextLine();
        System.out.print("Digite a idade do diretor: ");
        int age=this.sc.nextInt();
        System.out.print("Digite o gênero do diretor: ");
        sc.nextLine();
        String gender=this.sc.nextLine();
        int idDirector=this.directorService.createDirector(name,age,gender);
        System.out.printf("Diretor %s criado com Id %d cadastrado com sucesso.", name, idDirector);
        //createDirector();


    }

    private void printExecuteMenuCreateProducer() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        createProducer();
    }

    private void printExecuteMenuCreateScreenwriter() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        createScreenwriter();
    }

    private void printExecuteMenuCreateMovie() {
        System.out.println("---------------------------------");
        System.out.println("Cadastrar um filme:");
        System.out.println("---------------------------------");

        System.out.println("Digite o nome do filme:");
        String name = this.sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        boolean isParsingSuccess = false;
        LocalDate releaseDate = null;
        while(!isParsingSuccess) {
            try {
                System.out.println("Digite a data de lançamento do filme no formato dd/mm/aaaa:");
                String dateStr = this.sc.nextLine();
                releaseDate = LocalDate.parse(dateStr, formatter);
                isParsingSuccess = true;
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. O formato aceito é dd/mm/aaaa, por exemplo 17/08/2023.");
            }
        }

        isParsingSuccess = false;
        double budget = 0;

        while(!isParsingSuccess) {
            try {
                System.out.println("Digite o orçamento do filme:");
                budget = this.sc.nextDouble();
                isParsingSuccess = true;
            } catch (InputMismatchException e) {
                System.out.println(String.format("Número inválido. O formato aceito é por exemplo %.2f.", 12.99));
            }
            this.sc.nextLine();
        }

        System.out.println("Digite a descrição do filme:");
        String desc = this.sc.nextLine();

        int idMovie = createMovie(name, releaseDate, budget, desc);

        System.out.println(String.format("Filme %s com id %d cadastrado com sucesso!", name, idMovie));
        System.out.println("---------------------------------");
    }

    private void printExecuteMenuAssociateMovieActor() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        associateMovieActor();
    }

    private void printExecuteMenuAssociateMovieDirector() {

        associateMovieDirector();
    }

    private void printExecuteMenuAssociateMovieProducer() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        associateMovieProducer();
    }

    private void printExecuteMenuAssociateMovieScreenwriter() {
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        associateMovieScreenwriter();
    }

    private void printExecuteMenuFindMovie() {
        System.out.println("---------------------------------");
        System.out.println("Buscar um filme por nome:");
        System.out.println("---------------------------------");

        System.out.println("Digite o nome do filme:");
        String name = this.sc.nextLine();
        Movie movie = findMovie(name);

        if(movie == null) {
            System.out.println(String.format("Filme com nome %s não foi encontrado.", name));
        } else {
            System.out.println(movie);
        }
    }

    private void printExecuteMenuListAllMovies() {
        System.out.println("---------------------------------");
        System.out.println("Listar todos os filmes:");
        System.out.println("---------------------------------");
        for(Movie m : this.listAllMovies()) {
            System.out.println(m);
            System.out.println();
        }
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
                printExecuteMenuCreateActor();
                break;
            case 2:
                printExecuteMenuCreateDirector();
                break;
            case 3:
                printExecuteMenuCreateProducer();
                break;
            case 4:
                printExecuteMenuCreateScreenwriter();
                break;
            case 5:
                printExecuteMenuCreateMovie();
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
                printExecuteMenuAssociateMovieActor();
                break;
            case 2:
                printExecuteMenuAssociateMovieDirector();
                break;
            case 3:
                printExecuteMenuAssociateMovieProducer();
                break;
            case 4:
                printExecuteMenuAssociateMovieScreenwriter();
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
                printExecuteMenuFindMovie();
                break;
            case 4:
                printExecuteMenuListAllMovies();
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
