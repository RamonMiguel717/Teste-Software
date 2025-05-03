package dao;

/**
 * Classe que armazena os dados de configuração do banco de dados SQLite.
 *
 * @author osmarbraz
 */
public final class SQLiteDadosBanco {
    
    /** 
     * Evita que a classe seja instânciada.
     */
    private SQLiteDadosBanco() {
        
    }

    //Altere aqui os dados do seu banco de dados	
    public static final String DATABASE = "C:\\Users\\pc cliente\\Desktop\\faculdade\\teste_software\\cadastro_clintes.db";
    public static final String DRIVER = "org.sqlite.JDBC";
}

