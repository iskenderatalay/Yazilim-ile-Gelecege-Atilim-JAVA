package org.iskender.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;

public class PersonelManager {
    protected SessionFactory sessionFactory;
    protected void read() {}
    protected void setup() {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        try {
            sessionFactory=new MetadataSources(registry).buildMetadata().buildSessionFactory();
        }
        catch(Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
    protected void create(String name) {
        Personel personelObj = new Personel();
        personelObj.setAdsoyad(name);
        personelObj.setDogumtarihi("23.11.1990");
        personelObj.setGorev("Memur");
        personelObj.setMedenidurum((byte)1);
        personelObj.setSeyahatengeli((byte)0);
        personelObj.setSicilno((short)12345);
        personelObj.setTc("246");

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(personelObj);
        session.getTransaction().commit();
        session.close();
    }
    protected void delete(int id) {
        Personel personelObj = new Personel();
        personelObj.setId(id);
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(personelObj);
        session.getTransaction().commit();
        session.close();
    }
    protected void update(int id,String name,String dTarihi,String gorev,byte medeni,byte seyahat,short sicil,String tc) {
        Personel personelObj = new Personel();
        personelObj.setId(id);
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        personelObj.setAdsoyad(name);
        personelObj.setDogumtarihi(dTarihi);
        personelObj.setGorev(gorev);
        personelObj.setMedenidurum(medeni);
        personelObj.setSeyahatengeli(seyahat);
        personelObj.setSicilno(sicil);
        personelObj.setTc(tc);
        session.update(personelObj);
        session.getTransaction().commit();
        session.close();
    }
    protected void exit()
    {
        //sessionFactory.close();
    }
    public static void main(String[] args) {
        PersonelManager manager = new PersonelManager();
        manager.setup();
        //manager.create("Mehmet");
        //manager.delete(23);
        manager.update(22,"Selin","22.05.1990","İşçi", (byte) 0, (byte) 1, (short) 1212,"46888");
        manager.exit();
    }
}