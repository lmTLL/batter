package com.secondhand.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**   
* Copyright: Copyright (c) 2018
* @ClassName: DataConvert.java
* @Description: 该类的功能描述
* @version: v1.0.0
* @author: feri
* @date: 2018年12月19日 下午12:13:34 
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年12月19日       feri           v1.0.0               修改原因
*/
public class DateConvert implements Converter<String, Date>{

	/* (non-Javadoc)
	 * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
	 */
	@Override
	public Date convert(String cm) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			return sdf.parse(cm);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
