package math;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
/**
 * Created by Shakir on 8/16/2016.
 */
    public class ConnectDB {

        Connection connect = null;
        Statement statement = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        public static Properties loadProperties() throws IOException{
            Properties prop = new Properties();
            InputStream ism = new FileInputStream("C:\\Users\\shakir\\Downloads\\CoreNDSExamJuly2016-master\\src\\math\\MySql.properties");
            prop.load(ism);
            ism.close();

            return prop;
        }
        public void connectToDatabase() throws IOException, SQLException, ClassNotFoundException {
            Properties prop = loadProperties();
            String driverClass = prop.getProperty("MYSQLJDBC.driver");
            String url = prop.getProperty("MYSQLJDBC.url");
            String userName = prop.getProperty("MYSQLJDBC.userName");
            String password = prop.getProperty("MYSQLJDBC.password");
            Class.forName(driverClass);
            connect = DriverManager.getConnection(url,userName,password);
            System.out.println("Database is connected");
        }
    public List<String> readDataBase(String tableName, String columnName)throws Exception{
        List<String> data = new ArrayList<String>();

        try {
            connectToDatabase();
            statement = connect.createStatement();
            rs = statement.executeQuery("select * from " + tableName);
            data = getResultSetData(rs, columnName);
        } catch (ClassNotFoundException e) {
            throw e;
        }finally{
            close();
        }
        return data;
    }
    private void close() {
        try{
            if(rs != null){
                rs.close();
            }
            if(statement != null){
                statement.close();
            }
            if(connect != null){
                connect.close();
            }
        }catch(Exception e){

        }
    }
    private List<String> getResultSetData(ResultSet resultSet2,String columnName) throws SQLException {
        List<String> dataList = new ArrayList<String>();
        while(rs.next()){
            String itemName = rs.getString(columnName);
            dataList.add(itemName);
        }
        return dataList;
    }
    }

