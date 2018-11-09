package com.wj.util;

import com.wj.entity.User;
import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.file.SeekableByteArrayInput;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.specific.SpecificRecordBase;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AvroSerializeUtil {

    private static AvroSerializeUtil avroSerializeUtil;

    private AvroSerializeUtil() {

    }

    /**
     * 单例
     * @return
     */
    public static AvroSerializeUtil getInstance() {
        synchronized (AvroSerializeUtil.class) {
            if (avroSerializeUtil == null) {
                avroSerializeUtil = new AvroSerializeUtil();
            }
            return avroSerializeUtil;
        }
    }

    /**
     * 序列化到文件
     * @param clazz
     * @param data
     * @param path
     */
    public void serialize(Class<?> clazz, Object data, Schema schema,  String path) {
        DatumWriter datumWriter = new SpecificDatumWriter(clazz);
        DataFileWriter dataFileWriter = new DataFileWriter(datumWriter);
        try {
            dataFileWriter.create(schema, new File(path));
            dataFileWriter.append(data);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                dataFileWriter.close();
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    /**
     * 序列化列表到文件
     * @param clazz
     * @param dataList
     * @param path
     */
    public void serializeList(Class<?> clazz, List dataList, Schema schema, String path) {
        DatumWriter datumWriter = new SpecificDatumWriter(clazz);
        DataFileWriter dataFileWriter = new DataFileWriter(datumWriter);
        try {
            if (dataList != null&&dataList.size() > 0) {
                dataFileWriter.create(schema, new File(path));
                for (Object data: dataList) {
                    dataFileWriter.append(data);
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                dataFileWriter.close();
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    /**
     * 序列化为字节流
     * @param clazz
     * @param data
     * @return
     */
    public byte[] serialize(Class<?> clazz, Object data, Schema schema) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DatumWriter datumWriter = new SpecificDatumWriter(clazz);
        DataFileWriter dataFileWriter = new DataFileWriter(datumWriter);
        try {
            dataFileWriter.create(schema, baos);
            dataFileWriter.append(data);
            dataFileWriter.flush();
            return baos.toByteArray();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                dataFileWriter.close();
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 序列化列表为字节流
     * @param clazz
     * @param dataList
     * @return
     */
    public byte[] serializeList(Class<?> clazz, List dataList, Schema schema) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DatumWriter datumWriter = new SpecificDatumWriter(clazz);
        DataFileWriter dataFileWriter = new DataFileWriter(datumWriter);
        try {
            if (dataList != null&&dataList.size() > 0) {
                dataFileWriter.create(schema, baos);
                for (Object data: dataList) {
                    dataFileWriter.append(data);
                }
            }
            dataFileWriter.flush();
            return baos.toByteArray();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                dataFileWriter.close();
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 从文件反序列化
     * @param clazz
     * @param path
     * @return
     */
    public Object deserialize(Class<?> clazz, String path) {
        File file = new File(path);
        DatumReader datumReader = new SpecificDatumReader(clazz);
        DataFileReader dataFileReader = null;
        try {
            dataFileReader = new DataFileReader(file, datumReader);
            if (dataFileReader.hasNext()) {
                Object object = dataFileReader.next();
                return object;
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                if (dataFileReader != null) {
                    dataFileReader.close();
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 从文件反序列化为列表
     * @param clazz
     * @param path
     * @return
     */
    public List deserializeList(Class<?> clazz, String path) {
        List objectList = new ArrayList<>();
        File file = new File(path);
        DatumReader datumReader = new SpecificDatumReader(clazz);
        DataFileReader dataFileReader = null;
        try {
            dataFileReader = new DataFileReader(file, datumReader);
            while (dataFileReader.hasNext()) {
                Object object = dataFileReader.next();
                objectList.add(object);
            }
            return objectList;
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                if (dataFileReader != null) {
                    dataFileReader.close();
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 字节流反序列化
     * @param clazz
     * @param byteArray
     * @return
     */
    public Object deserialize(Class<?> clazz, byte[] byteArray) {
        SeekableByteArrayInput sbai = new SeekableByteArrayInput(byteArray);
        DatumReader datumReader = new SpecificDatumReader(clazz);
        DataFileReader dataFileReader = null;
        try {
            dataFileReader = new DataFileReader(sbai, datumReader);
            if (dataFileReader.hasNext()) {
                Object object = dataFileReader.next();
                return object;
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                if (dataFileReader != null) {
                    dataFileReader.close();
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 字节流反序列化为列表
     * @param clazz
     * @param byteArray
     * @return
     */
    public List deserializeList(Class<?> clazz, byte[] byteArray) {
        List objectList = new ArrayList<>();
        SeekableByteArrayInput sbai = new SeekableByteArrayInput(byteArray);
        DatumReader datumReader = new SpecificDatumReader(clazz);
        DataFileReader dataFileReader = null;
        try {
            dataFileReader = new DataFileReader(sbai, datumReader);
            while (dataFileReader.hasNext()) {
                Object object = dataFileReader.next();
                objectList.add(object);
            }
            return objectList;
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                if (dataFileReader != null) {
                    dataFileReader.close();
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }


    public static void main(String args[]) {
        AvroSerializeUtil avroSerializeUtil = AvroSerializeUtil.getInstance();
        User user = new User();
        user.setName("wangjun");
        user.setFavoriteNumber(11);
        user.setFavoriteColor("red");

        User userX = new User();
        userX.setName("wangjun");
        userX.setFavoriteNumber(11);
        userX.setFavoriteColor("red");

        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(userX);
        Schema schema = user.getSchema();
        //avroSerializeUtil.serialize(User.class, user, "e:\\user.avro");
        byte[] dataX = avroSerializeUtil.serialize(User.class, user, schema);
        User user1 = (User)avroSerializeUtil.deserialize(User.class, dataX);
        System.out.println(user1);

        byte[] data = avroSerializeUtil.serializeList(User.class, userList, schema);

        //User user1 = (User) avroSerializeUtil.deserialize(User.class, "e:\\user.avro");
        List<User> userList1 = (List<User>)avroSerializeUtil.deserializeList(User.class, data);
        System.out.println(userList1);
    }
}
