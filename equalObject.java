 public boolean equals(Object obj)
    {
    if (obj == this)
    {
        return true;
    }
    if (obj == null)
    {
        return false;
    }
    if (obj instanceof Contact)
    {
        Contact other = (Contact)obj;
        return other.getFirstName().equals(getFirstName()) &&
                other.getLastName().equals(getLastName()) &&
                other.getHomePhone().equals(getHomePhone()) &&
                other.getCellPhone().equals(getCellPhone());

    }
    else
    {
        return false;
    }
}

In many cases when overriding equals(..) you also have to override hashCode() (using the same fields). That's also specified in the javadoc
