package com.winterbe.java8.samples.stream;

/**
 * Author:Administrator
 * Date:  2017/1/11
 * Time: 16:17
 */


  public  class ValueAbsentException extends Throwable {

        public ValueAbsentException() {
            super();
        }

        public ValueAbsentException(String msg) {
            super(msg);
        }

        @Override
        public String getMessage() {
            return "No value present in the Optional instance";
        }
    }

