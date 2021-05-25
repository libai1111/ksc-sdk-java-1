package com.ksc.krds.model.log;

public class LogFile {

    private String LogFileName;
    private String Size;
    private String DBLogType;
    private Long WaitSeconds;
    private String Status;

    public String getLogFileName() {
        return LogFileName;
    }

    public void setLogFileName(String logFileName) {
        LogFileName = logFileName;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getDBLogType() {
        return DBLogType;
    }

    public void setDBLogType(String DBLogType) {
        this.DBLogType = DBLogType;
    }

    public Long getWaitSeconds() {
        return WaitSeconds;
    }

    public void setWaitSeconds(Long waitSeconds) {
        WaitSeconds = waitSeconds;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
