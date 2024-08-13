@Configuration
@EnableTransactionManagement

@EnableJpaRepositories(
basePackages = "com.example.repository.secondary",
entityManagerFactoryRef = "secondaryEntityManagerFactory",
transactionManagerRef = "secondaryTransactionManager"
)
public class SecondaryDataSourceConfig {
@Bean(name = "secondaryDataSource")
@ConfigurationProperties(prefix = "spring.datasource.secondary")
public DataSource secondaryDataSource() {
return DataSourceBuilder.create().build();
}
@Bean(name = "secondaryEntityManagerFactory")
public LocalContainerEntityManagerFactoryBean secondaryEntityManagerFactory(
EntityManagerFactoryBuilder builder, @Qualifier("secondaryDataSource") DataSource
dataSource) {
return builder
.dataSource(dataSource)
.packages("com.example.entity.secondary")
.persistenceUnit("secondary")
.build();
}
@Bean(name = "secondaryTransactionManager")
public PlatformTransactionManager secondaryTransactionManager(
@Qualifier("secondaryEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
return new JpaTransactionManager(entityManagerFactory);
}
}