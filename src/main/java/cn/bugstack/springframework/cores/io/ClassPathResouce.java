package cn.bugstack.springframework.cores.io;

import cn.bugstack.springframework.util.ClassUtils;
import cn.hutool.core.lang.Assert;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ClassPathResouce implements Resource{

    private final String path;

    private ClassLoader classLoader;

    public ClassPathResouce(String path){
        this(path,(ClassLoader)null);
    }
    public ClassPathResouce(String path,ClassLoader classLoader){
        Assert.notNull(path,"Path must not be null");
        this.classLoader = (classLoader !=null ? classLoader: ClassUtils.getDefaultClassLoader());
        this.path = path;
    }
    @Override
    public InputStream getInputStream() throws IOException {
        InputStream is = classLoader.getResourceAsStream(path);
        if (null == is){
            throw new FileNotFoundException(this.path+" cannot be opened because it does not exist");
        }
        return is;
    }
}
