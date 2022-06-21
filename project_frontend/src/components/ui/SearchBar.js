const SearchBar = () => {
    return (
        <>
        <div className="search-container">
            <form className="search-box">
                <input 
                type="search"
                placeholder="Search..."
                required />

            </form>


        </div>
        </>
    );
}

export default SearchBar;