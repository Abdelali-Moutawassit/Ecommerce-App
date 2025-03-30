package abdelali.tp.ecommeceapp;

import abdelali.tp.ecommeceapp.entities.Categorie;
import abdelali.tp.ecommeceapp.entities.Client;
import abdelali.tp.ecommeceapp.entities.Commande;
import abdelali.tp.ecommeceapp.entities.Produit;
import abdelali.tp.ecommeceapp.enums.CommandeStatus;
import abdelali.tp.ecommeceapp.enums.ProductStatus;
import abdelali.tp.ecommeceapp.enums.Role;
import abdelali.tp.ecommeceapp.repositories.CategorieRepository;
import abdelali.tp.ecommeceapp.repositories.ClientRepository;
import abdelali.tp.ecommeceapp.repositories.CommandeRepository;
import abdelali.tp.ecommeceapp.repositories.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class EcommeceAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommeceAppApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ClientRepository clientRepository, ProduitRepository produitRepository, CategorieRepository categorieRepository, CommandeRepository commandeRepository) {
        return args -> {
            // Création de catégories
            Categorie categorie1 = new Categorie();
            categorie1.setNom("Électronique");
            categorieRepository.save(categorie1);

            Categorie categorie2 = new Categorie();
            categorie2.setNom("Mode");
            categorieRepository.save(categorie2);

            Categorie categorie3 = new Categorie();
            categorie3.setNom("Maison");
            categorieRepository.save(categorie3);

            Categorie categorie4 = new Categorie();
            categorie4.setNom("Sports");
            categorieRepository.save(categorie4);

            Categorie categorie5 = new Categorie();
            categorie5.setNom("Livres");
            categorieRepository.save(categorie5);

            // Création de produits
            Produit produit1 = new Produit();
            produit1.setNom("Smartphone");
            produit1.setDescription("Un smartphone haute performance");
            produit1.setImageUrl("https://m.media-amazon.com/images/I/716OmvUFy1L._AC_SL1500_.jpg");
            produit1.setPrix(299.99);
            produit1.setStock(50);
            produit1.setStatus(ProductStatus.DISPONIBLE);
            produit1.setCategorie(categorie1);
            produitRepository.save(produit1);

            Produit produit2 = new Produit();
            produit2.setNom("T-shirt");
            produit2.setDescription("T-shirt en coton bio");
            produit2.setImageUrl("https://ma.jumia.is/unsafe/fit-in/680x680/filters:fill(white)/product/83/917426/2.jpg?6991");
            produit2.setPrix(19.99);
            produit2.setStock(100);
            produit2.setStatus(ProductStatus.DISPONIBLE);
            produit2.setCategorie(categorie2);
            produitRepository.save(produit2);

            Produit produit3 = new Produit();
            produit3.setNom("Casque Audio");
            produit3.setDescription("Casque sans fil avec réduction de bruit");
            produit3.setImageUrl("https://www.cdiscount.com/pdt2/8/1/2/1/700x700/fi30121512812.jpg");
            produit3.setPrix(59.99);
            produit3.setStock(30);
            produit3.setStatus(ProductStatus.DISPONIBLE);
            produit3.setCategorie(categorie1);
            produitRepository.save(produit3);

            Produit produit4 = new Produit();
            produit4.setNom("Jean Homme");
            produit4.setDescription("Jean slim en denim");
            produit4.setImageUrl("https://ma.jumia.is/unsafe/fit-in/500x500/filters:fill(white)/product/89/796834/1.jpg?4284");
            produit4.setPrix(49.99);
            produit4.setStock(150);
            produit4.setStatus(ProductStatus.DISPONIBLE);
            produit4.setCategorie(categorie2);
            produitRepository.save(produit4);

            Produit produit5 = new Produit();
            produit5.setNom("https://bestmobilier.com/27230-pdt_720/tala-canape-3-places-convertible-en-tissu.webp");
            produit5.setDescription("Canapé confortable pour salon");
            produit5.setImageUrl("");
            produit5.setPrix(199.99);
            produit5.setStock(20);
            produit5.setStatus(ProductStatus.DISPONIBLE);
            produit5.setCategorie(categorie3);
            produitRepository.save(produit5);

            Produit produit6 = new Produit();
            produit6.setNom("Veste en Cuir");
            produit6.setDescription("Veste en cuir pour homme");
            produit6.setImageUrl("https://shop.mango.com/assets/rcs/pics/static/T5/fotos/S/57095947_30.jpg?imwidth=2048&imdensity=1&ts=1691693143006");
            produit6.setPrix(79.99);
            produit6.setStock(25);
            produit6.setStatus(ProductStatus.DISPONIBLE);
            produit6.setCategorie(categorie2);
            produitRepository.save(produit6);

            Produit produit7 = new Produit();
            produit7.setNom("Livre Java");
            produit7.setDescription("Apprendre Java en 30 jours");
            produit7.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTtZYywYpymsVQ4Qz1szVJOiPEt2ZTwbfY_eg&s");
            produit7.setPrix(29.99);
            produit7.setStock(50);
            produit7.setStatus(ProductStatus.DISPONIBLE);
            produit7.setCategorie(categorie5);
            produitRepository.save(produit7);

            Produit produit8 = new Produit();
            produit8.setNom("Tapis Salon");
            produit8.setDescription("Tapis doux pour salon");
            produit8.setImageUrl("https://cdn.media.unamourdetapis.ma/media/catalog/product/cache/dac308bb69751c2685d80ea19bd1dbd2/t/a/tapis-de-salon-contemporain--bio-multicolore-amb-unamourdetapis.jpg");
            produit8.setPrix(99.99);
            produit8.setStock(30);
            produit8.setStatus(ProductStatus.DISPONIBLE);
            produit8.setCategorie(categorie3);
            produitRepository.save(produit8);

            Produit produit9 = new Produit();
            produit9.setNom("Basket Sport");
            produit9.setDescription("Basket légère pour course");
            produit9.setImageUrl("https://www.cdiscount.com/pdt2/8/9/5/3/700x700/mp54372895/rw/baskets-homme-chaussure-jogging-ultra-leger-course.jpg");
            produit9.setPrix(59.99);
            produit9.setStock(80);
            produit9.setStatus(ProductStatus.DISPONIBLE);
            produit9.setCategorie(categorie4);
            produitRepository.save(produit9);

            Produit produit10 = new Produit();
            produit10.setNom("Montre Connectée");
            produit10.setDescription("Montre connectée pour suivre votre santé");
            produit10.setImageUrl("https://ma.jumia.is/unsafe/fit-in/500x500/filters:fill(white)/product/01/115636/1.jpg?2485");
            produit10.setPrix(199.99);
            produit10.setStock(45);
            produit10.setStatus(ProductStatus.DISPONIBLE);
            produit10.setCategorie(categorie1);
            produitRepository.save(produit10);

            Produit produit11 = new Produit();
            produit11.setNom("Chaise Gaming");
            produit11.setDescription("Chaise ergonomique pour gamers");
            produit11.setImageUrl("https://setupgame.ma/wp-content/uploads/2024/06/Hybrok-Fighter-Bleu-Noir-Setup-Game.jpg");
            produit11.setPrix(129.99);
            produit11.setStock(60);
            produit11.setStatus(ProductStatus.DISPONIBLE);
            produit11.setCategorie(categorie3);
            produitRepository.save(produit11);

            Produit produit12 = new Produit();
            produit12.setNom("Vêtements de Plage");
            produit12.setDescription("Vêtements légers pour plage");
            produit12.setImageUrl("https://m.media-amazon.com/images/I/81iPxhRRuGL._AC_UY1000_.jpg");
            produit12.setPrix(39.99);
            produit12.setStock(100);
            produit12.setStatus(ProductStatus.DISPONIBLE);
            produit12.setCategorie(categorie2);
            produitRepository.save(produit12);

            Produit produit13 = new Produit();
            produit13.setNom("Lampe LED");
            produit13.setDescription("Lampe à économie d'énergie");
            produit13.setImageUrl("https://www.bricoma.ma/pub/media/catalog/product/cache/7ae06499deb90fe0eec5741ca023c477/h/i/high-power-hd-e27_2.png");
            produit13.setPrix(19.99);
            produit13.setStock(200);
            produit13.setStatus(ProductStatus.DISPONIBLE);
            produit13.setCategorie(categorie3);
            produitRepository.save(produit13);

            Produit produit14 = new Produit();
            produit14.setNom("Tablette Graphique");
            produit14.setDescription("Tablette pour dessinateurs");
            produit14.setImageUrl("https://fournishop.ma/32883-large_default/-tablette-graphique-professionnelle-wacom-cintiq-13hd-dtk-1300-2-.jpg");
            produit14.setPrix(149.99);
            produit14.setStock(25);
            produit14.setStatus(ProductStatus.DISPONIBLE);
            produit14.setCategorie(categorie1);
            produitRepository.save(produit14);

            Produit produit15 = new Produit();
            produit15.setNom("Sac de Voyage");
            produit15.setDescription("Sac de voyage durable");
            produit15.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRoZbFdA3ahaaEYGTu9RPClazL65RsS-vEm_g&s");
            produit15.setPrix(59.99);
            produit15.setStock(100);
            produit15.setStatus(ProductStatus.DISPONIBLE);
            produit15.setCategorie(categorie2);
            produitRepository.save(produit15);

            // Création de clients
            Client client1 = new Client();
            client1.setNom("Alice Dupont");
            client1.setEmail("alice@example.com");
            client1.setMotDePasse("password");
            client1.setRole(Role.CLIENT);
            clientRepository.save(client1);

            Client client2 = new Client();
            client2.setNom("Bob Martin");
            client2.setEmail("bob@example.com");
            client2.setMotDePasse("password");
            client2.setRole(Role.CLIENT);
            clientRepository.save(client2);

            Client client3 = new Client();
            client3.setNom("Claire Lefevre");
            client3.setEmail("claire@example.com");
            client3.setMotDePasse("password");
            client3.setRole(Role.CLIENT);
            clientRepository.save(client3);

            Client client4 = new Client();
            client4.setNom("David Robert");
            client4.setEmail("david@example.com");
            client4.setMotDePasse("password");
            client4.setRole(Role.CLIENT);
            clientRepository.save(client4);

            Client client5 = new Client();
            client5.setNom("Eva Bernard");
            client5.setEmail("eva@example.com");
            client5.setMotDePasse("password");
            client5.setRole(Role.CLIENT);
            clientRepository.save(client5);

            List<Produit> produitList1 = new ArrayList<>();
            produitList1.add(produit1);
            produitList1.add(produit2);

            List<Produit> produitList2 = new ArrayList<>();
            produitList2.add(produit3);
            produitList2.add(produit4);

            List<Produit> produitList3 = new ArrayList<>();
            produitList3.add(produit5);
            produitList3.add(produit6);

            List<Produit> produitList4 = new ArrayList<>();
            produitList4.add(produit10);
            produitList4.add(produit9);

            List<Produit> produitList5 = new ArrayList<>();
            produitList5.add(produit11);
            produitList5.add(produit2);


            // Création de commandes
            Commande commande1 = new Commande();
            commande1.setClient(client1);
            commande1.setProduits(produitList1);
            commande1.setStatus(CommandeStatus.EN_COURS);
            commande1.setDateCommande(LocalDate.now());
            commandeRepository.save(commande1);

            Commande commande2 = new Commande();
            commande2.setClient(client2);
            commande2.setProduits(produitList2);
            commande2.setStatus(CommandeStatus.EN_COURS);
            commande2.setDateCommande(LocalDate.now());
            commandeRepository.save(commande2);

            Commande commande3 = new Commande();
            commande3.setClient(client3);
            commande3.setProduits(produitList3);
            commande3.setStatus(CommandeStatus.EN_COURS);
            commande3.setDateCommande(LocalDate.now());
            commandeRepository.save(commande3);

            Commande commande4 = new Commande();
            commande4.setClient(client4);
            commande4.setProduits(produitList4);
            commande4.setStatus(CommandeStatus.EN_COURS);
            commande4.setDateCommande(LocalDate.now());
            commandeRepository.save(commande4);

            Commande commande5 = new Commande();
            commande5.setClient(client5);
            commande5.setProduits(produitList5);
            commande5.setStatus(CommandeStatus.EN_COURS);
            commande5.setDateCommande(LocalDate.now());
            commandeRepository.save(commande5);

            // Ajoutez plus de commandes selon vos besoins
        };
    }
}
